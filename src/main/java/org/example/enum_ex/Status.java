package org.example.enum_ex;

import javax.swing.*;

/**
 *  Enum (перечисление) — в программировании тип данных, чьё множество значений представляет собой ограниченный список значений
 *  Здесь хранятся константные значения, пишутся они с большой буквы и через snake_case
 *
 *  1) camel case - newProductInBasket
 *  2) snake case - new_product_in_basket
 *  3) kebab case - new-product-in-basket
 */
public enum Status {
    ACTIVE("Активный"),
    IN_PROGRESS("В процессе"),
    COMPLETED("Завершен");

    private String name;

    Status(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
