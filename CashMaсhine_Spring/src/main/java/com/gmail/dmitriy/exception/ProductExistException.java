package com.gmail.dmitriy.exception;

public class ProductExistException extends Exception {
    @Override
    public String getMessage() {
        return "Product is already exist";
    }
}
