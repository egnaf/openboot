package com.github.openboot.service.impl;

import com.github.openboot.repository.QuestionRepository;
import com.github.openboot.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {

    private final QuestionRepository questionRepository;

    @Override
    public String search(String question) {
        return null;
    }
}
