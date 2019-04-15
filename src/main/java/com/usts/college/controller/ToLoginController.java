package com.usts.college.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class ToLoginController {
    @RequestMapping("/mainAdmin")
    public String TomainAdminJsp() {
        return "mainAdmin";
    }

    @RequestMapping("/mainManager")
    public String TomainManagerJsp() {
        return "mainManager";
    }

    @RequestMapping("/mainLifemanager")
    public String TomainLifemanagerJsp() {
        return "mainLifemanager";
    }

}
