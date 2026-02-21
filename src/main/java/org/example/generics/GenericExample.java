package org.example.generics;

import org.example.animal.Lion;
import org.example.collections.Book;

import java.io.Serializable;

public class GenericExample<T extends Comparable<T>, V extends Serializable, K extends Number> {
    private T t;
    private V v;
    private K k;

    public GenericExample(T t , V v , K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public void print(){
        System.out.println(t.getClass().toString() + ", " + v.getClass().toString() + ", " + k.getClass().toString());
    }

    public static void main(String[] args) {
        GenericExample<Book, String, Integer> example = new GenericExample<>(
                new Book("fathers&sons", "Turgenev", 1924),
                "example",
                2026
        );

        example.print();
    }
}
