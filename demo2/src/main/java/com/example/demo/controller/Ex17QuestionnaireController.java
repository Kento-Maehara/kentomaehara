package com.example.demo.controller;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.domain.Questionnaire;
import com.example.demo.form.Ex17QuestionnaireForm;
import com.example.demo.service.Ex17QuestionnaireService;

@Controller
@RequestMapping("/user2")
public class Ex17QuestionnaireController {

    @RequestMapping("")
    public String index(Model model) {
        Map<Integer,String> hobbyMap = new LinkedHashMap();
        hobbyMap.put(1,"野球");
        hobbyMap.put(2,"サッカー");
        hobbyMap.put(3,"テニス");

        model.addAttribute("hobbyMap", hobbyMap);
        return "user/ex-17-input";
    }
@RequestMapping("/create2")
public String create(Ex17QuestionnaireForm form, RedirectAttributes redirectAttributes) {
    Questionnaire user = new Questionnaire();
    BeanUtils.copyProperties(form, user);

    List<String> hobbyList = new ArrayList<>();
    for (Integer hobbyCode : form.getHobbyList()) {
        switch (hobbyCode) {
            case 1:
            hobbyList.add("野球");
            break;
            case 2:
            hobbyList.add("サッカー");
            break;
            case 3:
            hobbyList.add("テニス");
        }
    }
    user.setHobbyList(hobbyList);
    Ex17QuestionnaireService ex17Service = new Ex17QuestionnaireService();
    user = ex17Service.save(user);

    redirectAttributes.addFlashAttribute("user", user);

    return "redirect:/user2/toresult2";

}
@RequestMapping("/toresult2")
public String toresult() {
    return "user/result2";
}


}
