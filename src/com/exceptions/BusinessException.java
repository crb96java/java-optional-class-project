package com.exceptions;

public final class BusinessException extends RuntimeException {
    public BusinessException(String message) {
        super(message);
    }
}
