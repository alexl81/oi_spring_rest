package ru.oneicon.oi_spring_rest.exceptions;

public class IconNotFoundException extends RuntimeException {
    public IconNotFoundException(String message) {
        super(message);
    }
}
