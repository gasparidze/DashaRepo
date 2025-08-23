package org.example.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Collection framework - коллекции
 * Мы будем рассматривать 3 основных вида коллекций:
 * 1) List - динамический массив
 * 2) Set - множество
 * 3) Map - ассоциативный массив (мапа)
 */
public class ListExample {
    public static void main(String[] args) {
        /**
         * <> - называются diamonds, в них записывается тип данных листа
         * справа - реализация интерефейса List
         *
         * Важно: во всех коллекциях в качестве типа данных не может стоять примитивный тип (int, double, boolean и т д)
         * мы используем классы обертки:
         * int - Integer
         * float - Float
         * double - Double
         * boolean - Boolean
         *
         * классы обертки - это классы, объекты которых мы создаем (например, объект класса Integer)
         * Integer i = new Integer(1);
         */

        List<String> stringList = new ArrayList<>();
        stringList.add("hello");
        stringList.add("world");
        stringList.add("from Russia");
        stringList.add(3, "element");

        stringList.get(0); // hello

        for (String str : stringList){
            System.out.println(str);
        }

        System.out.println(stringList.size()); // 4
        System.out.println(stringList.contains("hello")); // true
        System.out.println(stringList.isEmpty()); // false
        System.out.println(stringList.remove(3)); // element
        System.out.println(stringList.remove("from Russia")); // true
    }
}
