package org.example.animal;

/**
 * Наследование - принцип ООП, согласно которому объект производного класса (т.е. класса наследника) может наследовать
 * поведение (т.е. методы) и состояния (т.е. свойства) базового класса (класса родителя). Это позволяет программисту создавать
 * похожие объекты без повторного переопределения характеристик
 */
public class Animal {
    private String nickname;
    private int age;
    private String environment;
    private double weight;

    public Animal(String nickname , int age , String environment , double weight) {
        this.nickname = nickname;
        this.age = age;
        this.environment = environment;
        this.weight = weight;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
