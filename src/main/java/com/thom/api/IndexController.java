package com.thom.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ThinkPad on 2017/3/5.
 */
@Controller
public class IndexController {

    @RequestMapping(value="login", method = RequestMethod.GET)
    public String login() {
        return "views/login";
    }

    @RequestMapping(value="main", method = RequestMethod.GET)
    public String main() {
        return "views/main";
    }

    @RequestMapping(value="profile", method = RequestMethod.GET)
    public String profile() {
        return "views/profile";
    }
}
