package org.example.exception;

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите индекс");
        int index = scanner.nextInt();

        try {
            int element = array[index];
            System.out.println(element);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ошибка");
        }

        System.out.println("program will continue");
    }
}
