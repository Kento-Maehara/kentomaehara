package com.example.demo.conroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/request-scope")

public class RequestScopeController {

    @RequestMapping("")
    public String index(){
        return "request-scope-form";
    }

    @RequestMapping("/input-name")
    public String inputName(int num1, int num2, Model model){
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        int sum = num1 + num2;
        model.addAttribute("sum",sum);
        return "result-request-scope";

}
}