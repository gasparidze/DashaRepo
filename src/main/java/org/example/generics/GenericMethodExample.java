package org.example.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("first string");
        stringList.add("second string");
        stringList.add("third string");

        fill(stringList, "new string");
        System.out.println(stringList);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        fill(numbers, 4);
        System.out.println(numbers);
    }

    /**
     * Generic method
     * <T> - говорит о том, что метод является generic-методов
     * T - параметризованный/обобщенный тип данных
     * переменные list и val должно быть одного типа данных T
     */
    public static <T> void fill(List<T> list, T val){
        list.add(val);
    }
}
