package com.usts.college.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.usts.college.bean.Msg;
import com.usts.college.service.LoginService;
import com.usts.college.service.LogindormmanagerService;
import com.usts.college.service.LoginlifemanagerService;

@Controller
public class LoginController {
    @Autowired
    LoginService LoginService;
    @Autowired
    LogindormmanagerService logindormmanagerservice;
    @Autowired
    LoginlifemanagerService loginlifemanagerservice;

    @RequestMapping("/loginAdmin")
    @ResponseBody
    public Msg login(@RequestParam("username") String username,
                     @RequestParam("password") String password,
                     @RequestParam("usertype") String usertype, HttpSession session) {
        if (usertype.equals("0")) {
            if (this.LoginService.loginAdmin(username, password)) {
                session.setAttribute("username", username);
                return Msg.success();
            }
        } else if (usertype.equals("1")) {
            if (this.logindormmanagerservice.loginManager(username, password)) {
                session.setAttribute("username", username);
                return Msg.success();
            }
        } else if (usertype.equals("2")) {
            if (this.loginlifemanagerservice.loginLife(username, password)) {
                session.setAttribute("username", username);
                return Msg.success();
            }
        }
        return Msg.fail();

        //return "login";
    }


}
