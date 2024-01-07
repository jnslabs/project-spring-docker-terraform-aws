package com.jnslabs.contactbook.controller.handler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Autor Jairo Nascimento
 * @Created 07/01/2024 - 09:37
 */

@RestControllerAdvice
public class ControllerAdvice {
    @ExceptionHandler(value = {Exception.class})
    public String handler(Exception ex){
        return ex.getMessage();
    }
}
