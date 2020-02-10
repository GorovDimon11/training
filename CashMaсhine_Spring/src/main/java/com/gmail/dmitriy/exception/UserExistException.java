package com.gmail.dmitriy.exception;

public class UserExistException extends Exception {
    @Override
    public String getMessage() {
        return "User is already registered";
    }
}
