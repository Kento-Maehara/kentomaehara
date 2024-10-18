package com.example.demo.conroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/receive2")
public class ReceiveController2 {

    @RequestMapping("")
    public String index(){
        return "info-form";
    }

@RequestMapping("/receive-info2")
public String receiveInfo() {
    return "redirect";
    }
}