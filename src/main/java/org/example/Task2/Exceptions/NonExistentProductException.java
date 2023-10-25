package org.example.Task2.Exceptions;

public class NonExistentProductException extends Exception {
    public NonExistentProductException() {
        super();
    }

    public NonExistentProductException(String message) {
        super(message);
    }
}
