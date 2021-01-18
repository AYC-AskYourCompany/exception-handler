package com.ayc.exceptionhandler.exception;

public class EntityNotFound extends Exception {

    public EntityNotFound(String errorMessage) {
        super(errorMessage);
    }
}
