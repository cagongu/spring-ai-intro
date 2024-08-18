package guru.springframework.spring_ai_intro.controllers;

import guru.springframework.spring_ai_intro.model.Answer;
import guru.springframework.spring_ai_intro.model.Question;
import guru.springframework.spring_ai_intro.services.OpenAIService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {

    private final OpenAIService openAIService;

    public QuestionController(OpenAIService openAIService) {
        this.openAIService = openAIService;
    }

    @PostMapping
    public Answer askQuestion(Question question) {
        return openAIService.getAnswer(question);
    }
}