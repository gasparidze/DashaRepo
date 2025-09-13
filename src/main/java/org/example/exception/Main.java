package org.example.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = scanner.nextLine();
        NameValidation nameValidation = new NameValidation();
        try {
            nameValidation.checkName(name);
        } catch (CustomException e) {
            System.out.println("Выброшено исключение");
            throw new RuntimeException();
        } finally {
            System.out.println("блок finally");
        }

        /**
         * Выкидывает checked exception => нужно обработать это исключение, т.к. оно является ожидаемым
         * Обработать исключение можно 2мя способами:
         * 1) try-catch-finally блока
         * В блок try помещается код, который потенциально может выкинуть exception
         * в блоке catch происзодит обработка исключения, чтобы программа не завершилась
         * т.е. если мы не хотим завершать программу при выбросе исключения, то мы можем это исключение отловить в блоке catch
         * и как-то его обработать
         * в catch указываем, какое именно исключение будем отлавливать, указываем либо непосредственно то исключение,
         * которые выбрасывается, либо класс родителя, если хотим отловить несколько исключений
         *
         * finally выполяется всегда вне зависимости от того, произошла ошибка или нет
         *
         * 2) throws в сигнатуре метода - он просто пробрасывает исключение блока кода, который вызвал этот метод
         */
        try {
            FileInputStream fileInputStream = new FileInputStream("sd");
        } catch (FileNotFoundException e) {
            System.out.println("выьрошено исключение");
        }
    }
}
