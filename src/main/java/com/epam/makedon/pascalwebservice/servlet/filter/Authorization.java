package com.epam.makedon.pascalwebservice.servlet.filter;

import com.epam.makedon.pascalwebservice.command.Page;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "AuthorizationFilter", urlPatterns = "/*")
public class Authorization implements Filter {
    private static final String LOGIN = "login";
    private static final String COMMAND = "command";
    private static final String CHANGE_LOCALE = "change_locale";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //
    }

    @Override
    public void destroy() {
        //
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;

        if (req.getServletPath().equals(Page.AUTHORIZATION.getPath())) {
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }

        String commandValue = req.getParameter(COMMAND);
        if (commandValue != null && commandValue.equals(CHANGE_LOCALE)) {
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }

        HttpSession session = req.getSession();
        if (!Boolean.valueOf((String)session.getAttribute(LOGIN))) {
            ((HttpServletResponse)servletResponse).sendRedirect(Page.AUTHORIZATION.getPath());
        }

        filterChain.doFilter(servletRequest, servletResponse);
    }
}
