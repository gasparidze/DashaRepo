package org.example.animal;

/**
 * Наследование - принцип ООП, согласно которому объект производного класса (т.е. класса наследника) может наследовать
 * поведение (т.е. методы) и состояния (т.е. свойства) базового класса (класса родителя). Это позволяет программисту создавать
 * похожие объекты без повторного переопределения характеристик
 *
 * Полиморфизм - это способность метода работать с данными разных типов.
 * Полиморфизм - это некоторый принцип, который позволяет одному и тому же фрагменту кода работать с разными типами данных.
 * Без наследования полиморфизм был бы невозможен.
 * Существует 2 типа полиморфизма:
 * 1) ad-hoc (мнимый) полиморфизм - это перегрузка методов
 * 2) параметрический (истинный) полиморфизм
 *
 * Абстракция означает разработку классов исходя из их функциональности, не принимая по внимание реализацию деталей.
 * Асбтрактный класс представляет собой некий макет/чертеж без включения фактической реализации.
 */
public abstract class Animal {
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

    /**
     * Если у нас в классе есть абстрактные методы, то теперь мы обязаны дать им реализацию в классах наследниках
     */
    public abstract void sayHello();

    public abstract void makeSound();
    public abstract void eat();

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

    @Override
    public String toString() {
        return "Animal{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                ", environment='" + environment + '\'' +
                ", weight=" + weight +
                '}';
    }
}
