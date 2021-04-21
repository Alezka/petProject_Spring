package com.owu.employeemanager.exeption;

public class UseNotFoundException extends RuntimeException{
    public UseNotFoundException(String message) {
        super(message);
    }
}
