package org.example.animal;

public class Lion extends Animal{
    private String maneColor;

    public Lion(String nickname , int age , String environment , double weight , String maneColor) {
        super(nickname , age , environment , weight);
        this.maneColor = maneColor;
    }

    @Override
    public void sayHello() {
        System.out.println("hello from lion");
    }

    @Override
    public void makeSound() {
        System.out.println("sound from lion");
    }

    @Override
    public void eat() {
        System.out.println("lion is eating");
    }

    public String getManeColor() {
        return maneColor;
    }

    public void setManeColor(String maneColor) {
        this.maneColor = maneColor;
    }
}
