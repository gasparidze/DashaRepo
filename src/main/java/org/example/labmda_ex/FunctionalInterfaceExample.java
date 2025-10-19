package org.example.labmda_ex;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * В Java есть 4 основных функциаональных интерфейса:
 * 1) Predicate<Integer> - метод boolean test(Integer value), который проверяет истинность какого-то условия
 * 2) Consumer<String> - в данном интерефейсе есть метод
 * void accept(String str), который что-то принимает в себя, но ничего не возвращает
 * 3) Supplier<String> - метод String get(), который что-то возвращает, но ничего не принимает
 * 4) Function<Integer, String> - метод String apply(Integer value), который что-то принимает во входных параметрах
 * и что-то возвращает
 */
public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        Predicate<Integer> predicate = age -> age >= 18;
        if (predicate.test(18)){
            System.out.println("Совершеннолетний");
        } else {
            System.out.println("нет 18");
        }

        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Hello from Consumer");

        Supplier<String> supplier = () -> "Hello from Supplier";
        String str = supplier.get();
        System.out.println(str);

        Function<Integer, String> function = age -> "Hello, I am " + age;
        String apply = function.apply(18);
        System.out.println(apply);

        test(() -> "Hello");
        test(() -> "World");
        test(() -> "From Russia");
    }

    /**
     * Благодаря функциональным интерфейсам и лямбда выражением программирование становится функциональным
     */
    private static void test(Supplier<String> supplier){
        System.out.println(supplier.get());
    }
}
