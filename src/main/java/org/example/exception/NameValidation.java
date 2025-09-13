package org.example.exception;

import java.util.Scanner;

public class NameValidation {
    public void checkName(String name) throws CustomException{

        /**
         * Исключения выбрасываются, тем самым останавливая работу программы
         *
         */
        if (name.isBlank()){
            throw new CustomException("Введенное имя некорректно");
        } else {
            System.out.println("Имя корректно");
        }
    }
}
