package com.epam.makedon.pascalwebservice.command.google;

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

public class GoogleTakeCode implements Command {
    private static final Logger LOGGER = LoggerFactory.getLogger(GoogleTakeCode.class);

    private static final String CODE = "code";
    private static final String LOGIN = "login";
    private static final String TRUE = "true";

    private static final String CLIENT_ID = "438931529282-mdtv66fngr4vms2b3351c8u1gccpfi43.apps.googleusercontent.com";
    private static final String CLIENT_SECRET = "Ab_hm-CoMhuXXV-2DuL_ci7V";
    private static final String REDIRECT_URI = "http://localhost:8080/Controller?command=google_take_code";
    private static final String GOOGLE_AUTH_URI = "https://www.googleapis.com/oauth2/v4/token";

    private static final String ACCESS_TOKEN = "access_token";
    private static final String EXPIRES_IN = "expires_in";

    @Override
    public Router execute(HttpServletRequest req) {
        String code = req.getParameter(CODE);

        HttpClient httpclient = new HttpClient();
        PostMethod post = new PostMethod(GOOGLE_AUTH_URI);
        post.addParameter("client_id", CLIENT_ID);
        post.addParameter("client_secret", CLIENT_SECRET);
        post.addParameter("redirect_uri", REDIRECT_URI);
        post.addParameter("code", code);
        post.addParameter("grant_type", "authorization_code");
        try {
            httpclient.executeMethod(post);
            JSONObject json = new JSONObject(new JSONTokener(new InputStreamReader(post.getResponseBodyAsStream())));

            if (!(json.has(ACCESS_TOKEN) && json.has(EXPIRES_IN))) {
                LOGGER.error("token hasn't taken");
                throw new CommandException("token hasn't taken");
            }

            String token = String.valueOf(json.get(ACCESS_TOKEN));
            String expiresIn = String.valueOf(json.get(EXPIRES_IN));

            LOGGER.info("token - " + token);
            LOGGER.info("expiresIn - " + expiresIn);

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
