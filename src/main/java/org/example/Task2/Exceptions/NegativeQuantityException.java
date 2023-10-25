package org.example.Task2.Exceptions;

public class NegativeQuantityException extends Exception {
    public NegativeQuantityException() {
        super();
    }

    public NegativeQuantityException(String message) {
        super(message);
    }
}
