package com.zeq.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

@RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
