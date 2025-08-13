package org.example.animal;

public class Lion extends Animal{
    private String maneColor;

    public Lion(String nickname , int age , String environment , double weight , String maneColor) {
        super(nickname , age , environment , weight);
        this.maneColor = maneColor;
    }

    public String getManeColor() {
        return maneColor;
    }

    public void setManeColor(String maneColor) {
        this.maneColor = maneColor;
    }
}
