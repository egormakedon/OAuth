package com.epam.makedon.pascalwebservice.command.vk;

import com.epam.makedon.pascalwebservice.command.Command;
import com.epam.makedon.pascalwebservice.command.CommandException;
import com.epam.makedon.pascalwebservice.command.Page;
import com.epam.makedon.pascalwebservice.servlet.Router;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.InputStreamReader;

public class VkTakeCode implements Command {
    private static final Logger LOGGER = LoggerFactory.getLogger(VkTakeCode.class);

    private static final String CODE = "code";
    private static final String LOGIN = "login";
    private static final String TRUE = "true";

    private static final String CLIENT_ID = "6441386";
    private static final String CLIENT_SECRET = "ZL3U7xpHdTW3hq3Z82mj";
    private static final String REDIRECT_URI = "http://localhost:8080/Controller?command=vk_take_code";
    private static final String VK_AUTH_URI = "https://oauth.vk.com/access_token";

    private static final String ACCESS_TOKEN = "access_token";
    private static final String EXPIRES_IN = "expires_in";
    private static final String USER_ID = "user_id";
    private static final String ERROR = "error";
    private static final String ERROR_DESCRIPTION = "error_description";

    @Override
    public Router execute(HttpServletRequest req) {
        String code = req.getParameter(CODE);

        HttpClient httpclient = new HttpClient();
        PostMethod post = new PostMethod(VK_AUTH_URI);
        post.addParameter("client_id", CLIENT_ID);
        post.addParameter("client_secret", CLIENT_SECRET);
        post.addParameter("redirect_uri", REDIRECT_URI);
        post.addParameter("code", code);
        try {
            httpclient.executeMethod(post);
            JSONObject json = new JSONObject(new JSONTokener(new InputStreamReader(post.getResponseBodyAsStream())));

            if (json.has(ERROR) && json.has(ERROR_DESCRIPTION)) {
                String error = String.valueOf(json.get(ERROR));
                String errorDescription = String.valueOf(json.get(ERROR_DESCRIPTION));

                LOGGER.error("error - " + error + "; description - " + errorDescription);
                throw new CommandException("error - " + error + "; description - " + errorDescription);
            }

            String token = String.valueOf(json.get(ACCESS_TOKEN));
            String expiresIn = String.valueOf(json.get(EXPIRES_IN));
            String userId = String.valueOf(json.get(USER_ID));

            LOGGER.info("token - " + token);
            LOGGER.info("expiresIn - " + expiresIn);
            LOGGER.info("userId - " + userId);

            HttpSession session = req.getSession();
            session.setAttribute(LOGIN, TRUE);

            Router router = new Router();
            router.setRedirect();
            router.setPath(Page.INDEX.getPath());
            return router;
        } catch (IOException e) {
            LOGGER.error("", e);
            throw new CommandException("", e);
        }
    }
}
