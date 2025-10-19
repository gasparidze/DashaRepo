package org.example.labmda_ex;

import java.util.function.Function;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Function<Integer, Integer> expression = number -> number * number;
        int value = calculator.applyOperation(expression , 4);
        System.out.println(value);
        int value1 = calculator.applyOperation(number -> number * 10 , 2);
        System.out.println(value1);
    }
    public int applyOperation(Function<Integer, Integer> operation, int number){
        return operation.apply(number);
    }
}
