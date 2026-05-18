package com.exam.controller.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {IllegalArgumentException.class,
            NullPointerException.class,
            ArithmeticException.class})

    //public ModelAndView handleException(Exception ex, RedirectAttributes redirectAttributes){
    public String handleException(Exception ex, Model model){

        model.addAttribute("message",ex.getMessage());
        return "error/error";  //error/error.html
    }
}
