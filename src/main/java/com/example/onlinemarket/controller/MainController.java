package com.example.onlinemarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("market")
public class MainController {
    @RequestMapping("/main")
    public ModelAndView getAll(){

        return new ModelAndView("index");

    }

    @RequestMapping("/settings")
    public ModelAndView get(){
        return new ModelAndView("settings");
    }
}
