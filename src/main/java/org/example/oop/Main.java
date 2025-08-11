package org.example.oop;

public class Main {
    public static void main(String[] args) {
        /**
         * Слева у нас тип данных (Human) и название переменной
         * справа у нас происходит создание объекта/экземпляра класса Human
         * ключевое слово new выделяет память в оперативке под новый объект и возвращает нам ссылку на него
         * и эта ссылка записывается в нашу переменную
         */
        Human dasha = new Human();
        dasha.name = "Dasha";
        dasha.age = 17;
        dasha.height = 160;
        dasha.weight = 50;

        System.out.println(dasha);

        Human artur = new Human();
        dasha.name = "Artur";
        dasha.age = 26;
        dasha.height = 181;
        dasha.weight = 72.2;

        System.out.println(artur);
    }
}
