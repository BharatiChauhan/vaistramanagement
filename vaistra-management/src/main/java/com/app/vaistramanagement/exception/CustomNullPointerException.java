package com.app.vaistramanagement.exception;

public class CustomNullPointerException extends RuntimeException {
    public CustomNullPointerException() {
    }

    public CustomNullPointerException(String msg) {
        super(msg);
    }
}