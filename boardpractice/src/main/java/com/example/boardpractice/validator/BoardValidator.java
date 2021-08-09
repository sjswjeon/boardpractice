package com.example.boardpractice.validator;

import com.example.boardpractice.model.Board;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.thymeleaf.util.StringUtils;

@Component
public class BoardValidator implements Validator {


    @Override
    public boolean supports(Class<?> clazz) {
        return Board.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        Board b = (Board) obj;
        if (StringUtils.isEmpty(b.getTitle())) {
            errors.rejectValue("title", "key", "Invalid title");
        }
        if (StringUtils.isEmpty(b.getContent())) {
            errors.rejectValue("content", "key", "Invalid content");
        }
    }
}
