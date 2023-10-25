package org.example.Task1;

import org.example.Task1.Exceptions.WrongLoginException;
import org.example.Task1.Exceptions.WrongPasswordException;

public class LoginValidator {
    public static boolean validate(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20) {
            throw new WrongLoginException("Login length should be less than 20 characters");
        }
        if (password.length() >= 20 || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password length should be less than 20 characters and should match with confirmPassword");
        }
        return true;
    }
}
