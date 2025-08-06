package com.apope.spring_ai_intro.service;

import com.apope.spring_ai_intro.model.Answer;
import com.apope.spring_ai_intro.model.GetCapitalRequest;
import com.apope.spring_ai_intro.model.Question;

public interface OpenAIService {

    String getAnswer(String question);

    Answer getAnswer(Question question);

    Answer getCapital(GetCapitalRequest getCapitalRequest);
}
