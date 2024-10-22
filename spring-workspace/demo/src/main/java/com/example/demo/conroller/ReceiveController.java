package com.example.demo.conroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import Form.ReceiveForm;

@Controller
@RequestMapping("/receive")
public class ReceiveController {

    @RequestMapping("")
    public String index(){
        return "info-form";
    }

@RequestMapping("/receive-info")
public String receiveInfo(ReceiveForm form) {
    System.out.println("入力された名前は" + form.getName() + "です。");
    System.out.println("入力された年齢は" + form.getAge() + "です。");
    return "finished";
    }
}