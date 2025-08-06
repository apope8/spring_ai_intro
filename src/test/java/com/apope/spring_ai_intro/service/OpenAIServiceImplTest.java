package com.apope.spring_ai_intro.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OpenAIServiceImplTest {

    @Autowired
    OpenAIServiceImpl openAIService;



    @Test
    void getAnswer() {
        String answer = openAIService.getAnswer("Write the game snake in python");
        System.out.println("Got the answer: ");
        System.out.println("=========================================");

        System.out.println(answer);
    }
}
