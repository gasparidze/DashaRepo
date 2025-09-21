package org.example.oop;

public class Main {
    public static void main(String[] args) {
        /**
         * Слева у нас тип данных (Human) и название переменной
         * справа у нас происходит создание объекта/экземпляра класса Human
         * ключевое слово new выделяет память в оперативке под новый объект и возвращает нам ссылку на него
         * и эта ссылка записывается в нашу переменную
         */
        Human dasha = new Human("Dasha", 17, 160, 50);

        System.out.println(dasha.getBalance());
        dasha.setBalance(0);
        System.out.println(dasha.getBalance());
//        System.out.println(dasha);
//        System.out.println(dasha.sayHello("Dasha"));
//        dasha.sayHello();

        System.out.println(Human.PI);

        Human artur = new Human("Artur", 26, 181, 72.2);
//        System.out.println(artur);
//        System.out.println(dasha.sayHello("Artur"));

        Human kate = new Human("Kate");

        Human masha = new Human();

        System.out.println(Human.PI);
        Human.sayHelloNew();
    }
}
