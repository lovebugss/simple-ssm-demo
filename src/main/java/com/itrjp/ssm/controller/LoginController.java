package com.itrjp.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by MAC on 2018/10/29.
 */
@Controller
//@RequestMapping("login")
public class LoginController {
    @RequestMapping(value = "login")
    public String toLogin(){

        return "login";
    }

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public ModelAndView login(String username,String password){

        ModelAndView mov = new ModelAndView();

        if (username == null || password == null){
            mov.setViewName("login");
        }
        mov.setViewName("index");
        return mov;
    }
}
