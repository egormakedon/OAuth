package com.epam.makedon.pascalwebservice.command;

import com.epam.makedon.pascalwebservice.command.article.Add;
import com.epam.makedon.pascalwebservice.command.article.ArticleService;
import com.epam.makedon.pascalwebservice.command.article.TakeArticle;
import com.epam.makedon.pascalwebservice.command.google.GoogleAuth;
import com.epam.makedon.pascalwebservice.command.google.GoogleTakeCode;
import com.epam.makedon.pascalwebservice.command.vk.VkAuth;
import com.epam.makedon.pascalwebservice.command.vk.VkTakeCode;

public enum Type {
    CHANGE_LOCALE(new ChangeLocale()),
    ADD(new Add()),
    TAKE_ARTICLE(new TakeArticle()),
    ARTICLE_SERVICE(new ArticleService()),
    LOGOUT(new Logout()),
    VK_AUTH(new VkAuth()),
    VK_TAKE_CODE(new VkTakeCode()),
    GOOGLE_AUTH(new GoogleAuth()),
    GOOGLE_TAKE_CODE(new GoogleTakeCode()),
    ;

    private Command command;
    Type(Command command) {
        this.command = command;
    }
    public Command getCommand() {
        return command;
    }
}