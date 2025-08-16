package org.example.animal;

/**
 * Tiger extends Animal говорит о том, что мы налседуем все свойства и методы из класса Animal в класс Tiger
 * Т.к. теперь Tiger - это наследник Animal, то при создании Tiger нам нужно будет создать Animal,
 * т.е. помимо конструктора Tiger также мы будем обязаны вызвать конструктор Animal
 *
 * super - ключевое слово, которое хранит ссылку на суперкласс (класс родитель)
 * super(param1, .., paramN) - вызываем конструктор родителя
 * super.filed - обращаемся к полю класса родителя
 * super.method() - вызываем метод класса родителя
 */
public class Tiger extends Animal{
    private String uniqueParam;

    public Tiger(String nickname , int age , String environment , double weight , String uniqueParam) {
        super(nickname , age , environment , weight);
        this.uniqueParam = uniqueParam;
    }

    /**
     * Мы можем переоопределять логику/реализацию метода класса родителя в классе наследнике, но сигнатура должна быть идентичной
     * @Override - аннотация , которая следит за сагнатурой метода
     */
    @Override
    public void sayHello() {
        System.out.println("hello from tiger");
    }

    @Override
    public void makeSound() {
        System.out.println("sound from tiger");
    }

    @Override
    public void eat() {
        System.out.println("tiger is eating");
    }

    public String getUniqueParam() {
        return uniqueParam;
    }

    public void setUniqueParam(String uniqueParam) {
        this.uniqueParam = uniqueParam;
    }
}
