package org.example.equals_example;

import java.util.Objects;

public class LuxuryAuto {
    private String model;
    private int manufactureYear;
    private int price;

    public LuxuryAuto(String model , int manufactureYear , int price) {
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * this - это ссылка на тот объект, на котором equals вызывается
     *
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LuxuryAuto that)) return false;
        return manufactureYear == that.manufactureYear && price == that.price && Objects.equals(model , that.model);
    }

    /**
     * hashCode() нужен также для сравнения объектов
     * но зачем hashcode, когда у нас есть equals? - для повышения производительности
     * Хеш-функция, которая предоставлена в Java методом hashCode(), возврщает числовое значение фикисровнной длины
     * для любого объекта. В случае Java hashCode возвращет 32-битное число тип int
     *
     * Если в программе сравниваются 2 объекта, гораздо проще сравнить их по hashCode (т.е. по числу)
     * и только если они равны по hashCode, можно переходить к савнению по equals
     *
     * Отсюда следует 3 правила:
     * 1) если два объекта равны по equals(), то у них обязательно должен быть одинаковый hashCode
     * 2) правило 1 не работает в обратную сторону, потому что у двух разных объектов может быть одинаковый хешкод
     * Ситуация, при которой у двух разных объектов может быть одинаковый хешкод называется коллизией
     * Коллизия может возникнуть, если плохо реализована хеш-функция
     * т.е.
     * obj1.hashCode() == obj2.hashCode() не следует obj1.equals(obj2) == true
     * obj1.equals(obj2) == true следует obj1.hashCode() == obj2.hashCode()
     *
     * 3) если метод hashCode вызывается несколько раз на одном и том же объекте,
     * каждый раз он должен возвращать одно и то же число
     */
    @Override
    public int hashCode() {
        return Objects.hash(model , manufactureYear , price);
    }
}
