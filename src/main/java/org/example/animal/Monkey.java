package org.example.animal;

public class Monkey extends Animal{
    private int quantityOfBananas;

    public Monkey(String nickname , int age , String environment , double weight , int quantityOfBananas) {
        super(nickname , age , environment , weight);
        this.quantityOfBananas = quantityOfBananas;
    }

    @Override
    public void sayHello() {
        System.out.println("hello from monkey");
    }

    @Override
    public void makeSound() {
        System.out.println("sound from monkey");
    }

    @Override
    public void eat() {
        System.out.println("monkey is eating");
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
