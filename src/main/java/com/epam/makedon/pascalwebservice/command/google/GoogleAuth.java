package com.epam.makedon.pascalwebservice.command.google;

import com.epam.makedon.pascalwebservice.command.Command;
import com.epam.makedon.pascalwebservice.servlet.Router;

import javax.servlet.http.HttpServletRequest;

public class GoogleAuth implements Command {
    private static final String CLIENT_ID = "438931529282-mdtv66fngr4vms2b3351c8u1gccpfi43.apps.googleusercontent.com";
    private static final String REDIRECT_URI = "http://localhost:8080/Controller?command=google_take_code";
    private static final String QUERY = "https://accounts.google.com/o/oauth2/auth?client_id="+CLIENT_ID+"&redirect_uri="+
            REDIRECT_URI+"&access_type=offline&response_type=code&scope=email";

    @Override
    public Router execute(HttpServletRequest req) {
        Router router = new Router();
        router.setRedirect();
        router.setPath(QUERY);
        return router;
    }
}
