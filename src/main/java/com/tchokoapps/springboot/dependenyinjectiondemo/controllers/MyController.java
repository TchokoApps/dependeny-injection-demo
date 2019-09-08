package com.tchokoapps.springboot.dependenyinjectiondemo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public void sayHello() {
        System.out.println("hello world");
    }
}
