package com.exceptions;

public class NameValidationException extends RuntimeException {
    public NameValidationException(String message) {
        super(message);
    }
}