package com.mytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ThymeleaController {
    @RequestMapping(value = "/thymeleaf", method = RequestMethod.GET)
    public String thymeleaf(Model model) {
        model.addAttribute("hello", "jack");
        return "WEB-INF/templates/ce";
    }
}
