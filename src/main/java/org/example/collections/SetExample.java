package org.example.collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        /**
         * Set - это коллекция, представляющая из себя множество уникальных элементов
         * на будущее: Set используется в теории множеств:
         * 1) объединение - addAll()
         * 2) пересечение - retainAll()
         * 3) разность - removeAll()
         */
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(0);
        integerSet.add(1);
        integerSet.add(1);
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);

        System.out.println(integerSet);

        /**
         * поулчать элементы Set можно только в цикле
         * у Set нет метода get()
         */
        for (Integer str : integerSet){
            System.out.println(str);
        }
    }
}

