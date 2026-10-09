package ru.trickluan.spring.lw2.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.trickluan.spring.lw2.exception.UnsupportedCodeException;
import ru.trickluan.spring.lw2.exception.ValidationFailedException;
import ru.trickluan.spring.lw2.model.Request;

@Service
public class RequestValidationService implements ValidationService {
    @Override
    public void isValid(Request request, BindingResult bindingResult) throws ValidationFailedException, UnsupportedCodeException {
        if("123".equals(request.getUid()))
            throw new UnsupportedCodeException("Такое не позволительно!");

        if(bindingResult.hasErrors()) {
            throw new ValidationFailedException(bindingResult.getFieldError().toString());
        }
    }
}
