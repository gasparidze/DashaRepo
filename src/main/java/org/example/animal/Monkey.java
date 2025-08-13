package org.example.animal;

public class Monkey extends Animal{
    private int quantityOfBananas;

    public Monkey(String nickname , int age , String environment , double weight , int quantityOfBananas) {
        super(nickname , age , environment , weight);
        this.quantityOfBananas = quantityOfBananas;
    }

    public int getQuantityOfBananas() {
        return quantityOfBananas;
    }

    public void setQuantityOfBananas(int quantityOfBananas) {
        this.quantityOfBananas = quantityOfBananas;
    }

    public void uniqueMethod(){

    }
}
