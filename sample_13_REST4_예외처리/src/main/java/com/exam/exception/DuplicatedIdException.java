package com.exam.exception;

public class DuplicatedIdFoundException extends RuntimeException{
    public DuplicatedIdFoundException(String message){
        super(message);
    }
}
