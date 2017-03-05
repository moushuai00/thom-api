package com.thom.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by ThinkPad on 2017/3/5.
 */
@Controller
public class IndexController {

    @RequestMapping(value="hello")
    public ModelAndView printWelcome(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mav= new ModelAndView();
        mav.addObject("city","test");
        mav.setViewName("views/login");
        return mav;
    }
}
