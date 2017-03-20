package com.thom.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ThinkPad on 2017/3/5.
 */
@Controller
public class ActionController {

    @RequestMapping(value="action/list", method = RequestMethod.GET)
    public String list() {
        return "views/view_action";
    }

    @RequestMapping(value="action/create", method = RequestMethod.GET)
    public String create() {
        return "views/create_action";
    }

}
