package com.dx.web;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 杜兴 on 2018/7/22.
 */
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {

        return "index";
    }
}
