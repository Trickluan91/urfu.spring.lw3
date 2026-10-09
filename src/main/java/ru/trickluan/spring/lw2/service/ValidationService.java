package ru.trickluan.spring.lw2.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.trickluan.spring.lw2.exception.UnsupportedCodeException;
import ru.trickluan.spring.lw2.exception.ValidationFailedException;
import ru.trickluan.spring.lw2.model.Request;

@Service
public interface ValidationService {
    void isValid(Request request, BindingResult bindingResult) throws ValidationFailedException, UnsupportedCodeException;
}
