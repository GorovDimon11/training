package com.gmail.dmitriy.exception;

public class ProductNotFoundException extends Exception {
    @Override
    public String getMessage() {
        return "Product not found";
    }
}
