package com.luying.springboot.controller;

/**
 * @description:
 * @author: lijian
 * @create: 2019-02-02
 **/

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/hello")
    public String hh(){
        return "hello lijian";
    }
}
