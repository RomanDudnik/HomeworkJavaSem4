package org.example.Task2.Exceptions;

public class NonExistentCustomerException extends Exception {
    public NonExistentCustomerException() {
        super();
    }

    public NonExistentCustomerException(String message) {
        super(message);
    }
}
