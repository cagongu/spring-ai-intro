package guru.springframework.spring_ai_intro.services;

import guru.springframework.spring_ai_intro.model.Answer;
import guru.springframework.spring_ai_intro.model.GetCapitalRequest;
import guru.springframework.spring_ai_intro.model.GetCapitalResponse;
import guru.springframework.spring_ai_intro.model.Question;

public interface OpenAIService {
    Answer getCapitalWithInfo(GetCapitalRequest getCapitalRequest);

    GetCapitalResponse getCapital(GetCapitalRequest getCapitalRequest);

    String getAnswer(String question);

    Answer getAnswer(Question question);
}