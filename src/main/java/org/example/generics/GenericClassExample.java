package org.example.generics;

/**
 * параметризуем класс
 */
public class GenericClassExample<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        GenericClassExample<String> stringGenericClassExample = new GenericClassExample<>();
        stringGenericClassExample.setT("old string");
        System.out.println(stringGenericClassExample.getT());
        stringGenericClassExample.setT("new string");
        System.out.println(stringGenericClassExample.getT());

        GenericClassExample<Integer> integerGenericClassExample = new GenericClassExample<>();
        integerGenericClassExample.setT(123);
        System.out.println(integerGenericClassExample.getT());
        integerGenericClassExample.setT(456);
        System.out.println(integerGenericClassExample.getT());
    }
}
