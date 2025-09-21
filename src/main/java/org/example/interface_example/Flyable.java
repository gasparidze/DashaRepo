package org.example.interface_example;

/**
 * Интерфейс, в котором содержится только 1 метод называется функциональным
 */
@FunctionalInterface
public interface Flyable{
    /**
     * в интерфейсе этот метод по умолчанию является public abstract, поэтому можем не указывать
     */
    void fly();
}
