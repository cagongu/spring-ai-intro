package guru.springframework.spring_ai_intro.services;

import guru.springframework.spring_ai_intro.model.Answer;
import guru.springframework.spring_ai_intro.model.Question;

public interface OpenAIService {

    String getAnswer(String question);

    Answer getAnswer(Question question);
}