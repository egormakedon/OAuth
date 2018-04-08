package com.epam.makedon.pascalwebservice.command;

import com.epam.makedon.pascalwebservice.servlet.Router;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class Logout implements Command {
    private static final String LOGIN = "login";
    private static final String FALSE = "false";

    @Override
    public Router execute(HttpServletRequest req) {
        HttpSession session = req.getSession();
        session.setAttribute(LOGIN, FALSE);
        Router router = new Router();
        router.setRedirect();
        router.setPath(Page.INDEX.getPath());
        return router;
    }
}
