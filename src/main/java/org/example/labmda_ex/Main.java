package org.example.labmda_ex;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Validator validator1 = data -> data != null && !data.isBlank();
        boolean hello = validator1.validate("hello");
        System.out.println(hello);

        Validator validator2 = (String data) -> data.contains("@") && data.contains(".");
        boolean email = validator2.validate("test@mail.ru");
        System.out.println(email);

        Validator validator3 = (String data) -> {
          return data.contains("\\d+");
        };
        boolean digits = validator3.validate("123");
        System.out.println(digits);
    }
}

class ValidatorImpl implements Validator {

    @Override
    public boolean validate(String data) {
        return data != null && !data.isBlank();
    }
}