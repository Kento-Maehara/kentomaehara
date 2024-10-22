package com.example.demo.conroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")

public class HelloController {
    @RequestMapping("/hello/index2")
    public String index2() {
        return "hello-warld";
    }
    
}