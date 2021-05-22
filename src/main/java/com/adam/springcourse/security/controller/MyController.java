package com.adam.springcourse.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String getInfoForAllEmps(Model model){
        return "index";
    }

    @GetMapping("/hrInfo")
    public String hrInfo(){
        return "hr";
    }

    @GetMapping("/managerInfo")
    public String performance(){
        return "manager";
    }

    @GetMapping("/forbidden")
    public String forbidden(){
        return "forbidden";
    }
}
