package com.epam.makedon.pascalwebservice.command.vk;

import com.epam.makedon.pascalwebservice.command.Command;
import com.epam.makedon.pascalwebservice.servlet.Router;

import javax.servlet.http.HttpServletRequest;

public class VkAuth implements Command {
    private static final String CLIENT_ID = "6441386";
    private static final String REDIRECT_URI = "http://localhost:8080/Controller?command=vk_take_code";
    private static final String QUERY = "https://oauth.vk.com/authorize?client_id="+CLIENT_ID+"&display=page&redirect_uri="+REDIRECT_URI+"&scope=notify&response_type=code&v=5.74";

    @Override
    public Router execute(HttpServletRequest req) {
        Router router = new Router();
        router.setRedirect();
        router.setPath(QUERY);
        return router;
    }
}
