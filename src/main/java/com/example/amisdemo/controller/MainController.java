package com.example.amisdemo.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Controller
@RequestMapping(value = "/")
public class MainController {

    @RequestMapping(value ="/index" , method = RequestMethod.GET)
    public String index(Model map, HttpServletRequest request) {
        map.addAttribute("name", "amis");
        map.addAttribute("message", "hello world");
        return "index";
    }


}
