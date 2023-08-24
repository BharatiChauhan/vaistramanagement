package com.app.vaistramanagement.exception;

public class DuplicateEntryException extends RuntimeException{
    public DuplicateEntryException(){}
    public DuplicateEntryException(String msg)
    {
        super(msg);
    }
}