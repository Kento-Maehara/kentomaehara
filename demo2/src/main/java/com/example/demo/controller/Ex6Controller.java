package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.ServletContext;

@Controller
@RequestMapping("/ex16")
public class Ex6Controller {

    @Autowired
    private ServletContext servletContext;

    @RequestMapping("/index")
    public String index() {
        
        if (servletContext.getAttribute("list") == null){
            List<Ex_16> list = new ArrayList<Ex_16>();
            servletContext.setAttribute("list", list);
        }
        return "ex-16";
        }
        @RequestMapping("/post")
        public String post(String name, String comment) {

            Ex_16 user = new Ex_16(name, comment);
            List<Ex_16> current = (List<Ex_16>) servletContext.getAttribute("list");
            current.add(0,user);
            return "ex-16";
        }

}