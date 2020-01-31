package com.gmail.dmitriy.exceptions;

public class UserExistException extends Exception {
    @Override
    public String getMessage() {
        return "User is already registered";
    }
}
