package com.app.vaistramanagement.exception;

public class InactiveStatusException extends RuntimeException {
    public InactiveStatusException() {
    }

    public InactiveStatusException(String msg) {
        super(msg);
    }

}
