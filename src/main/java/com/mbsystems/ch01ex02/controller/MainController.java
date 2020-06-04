package com.mbsystems.ch01ex02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping( "/main" )
    public String main() {
        return "main.html";
    }
}
