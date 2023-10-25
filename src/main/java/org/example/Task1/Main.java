package org.example.Task1;

import org.example.Task1.Exceptions.WrongLoginException;
import org.example.Task1.Exceptions.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        String login = "someverylongloginname";
        String password = "password123";
        String confirmPassword = "password321";

        try {
            boolean isSuccess = LoginValidator.validate(login, password, confirmPassword);
            System.out.println("Validation success: " + isSuccess);
        } catch (WrongLoginException e) {
            System.out.println("Wrong login: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Wrong password: " + e.getMessage());
        }
    }
}
