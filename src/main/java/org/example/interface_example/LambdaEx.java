package org.example.interface_example;

public class LambdaEx {
    public static void main(String[] args) {
        /**
         * Анонимный класс
         * new Flyable() - он сразу создает (под капотом) класс, который будет реализовывать этот интерфейс,
         * но у него нет имени => реализация этого класса помещается в переменную flyableImpl
         *
         * если нужны какие-то одноразовые, одноиспользуемые реализации, используют анонимные классы
         */
        Flyable flyableImpl = new Flyable() {
            @Override
            public void fly() {
                System.out.println("fly");
            }
        };

        /**
         * Java пошла еще дальше, введя lambda выражения
         * т.е. мы убрали все лишнее и оставили только суть
         *
         * Лямбда-выражение позволяет реализовывать интерфейс
         * Ляибда-выражения применяются только к функциональным интерфейсам
         */

        Flyable flyableImpl2 = () -> System.out.println("fly");
    }
}
