package ru.oneicon.oi_spring_rest.exceptions;

public class CategoryNotFoundException extends RuntimeException {
    public CategoryNotFoundException(String message) {
        super(message);
    }
}
