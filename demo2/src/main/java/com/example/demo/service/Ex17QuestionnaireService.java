package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.domain.Questionnaire;

@Service
public class Ex17QuestionnaireService {
    public Questionnaire save(Questionnaire user){
        return user;
    }

}
