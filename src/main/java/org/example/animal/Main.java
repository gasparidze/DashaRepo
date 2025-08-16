package org.example.animal;

public class Main {
    public static void main(String[] args) {
        Lion lion1 = new Lion("lion1", 10, "Africa", 100, "orange");
        Tiger tiger1 = new Tiger("tiger1", 8, "Africa", 80, "up");
        Monkey monkey1 = new Monkey("monkey1", 6, "Africa", 40,10);

        // берет реализацию с классов наследников
//        lion1.sayHello();
//        tiger1.sayHello();
//        monkey1.sayHello();

        saySmth(lion1);
        saySmth(tiger1);
        saySmth(monkey1);

        /**
         * Возможен еще такой вариант создания классов наследников
         * Слева указывается класс-родитель - это и будет типом данных для переменных
         * => данные объекты класса будут ограничены теми методами, которые есть в классе родителе
         * Справа указывается конкретный класс наследник, у которого будет браться реализация метода
         */
        Animal lion2 = new Lion("lion2", 10, "Africa", 100, "orange");
        Animal tiger2 = new Tiger("tiger2", 8,"Africa", 80, "up");
        Animal monkey2 = new Monkey("monkey2", 4, "Africa", 40, 8);

        lion2.sayHello(); // hello from lion
    }

    /**
     * Здесь мы пишем 3 метода под каждый тип данных
     * Благодаря наследованию, мы можем написать 1 метод, указав в качестве входного параметра - класс родитель
     * и далее при вызове метода sayHello() будет вызываться конкретная реализация класса наследника
     */
    public static void saySmth(Animal animal){
        // полиморфный вызов метода
        animal.sayHello();
    }
//    public static void saySmth(Lion lion){
//        lion.sayHello();
//    }
//
//    public static void saySmth(Tiger tiger){
//        tiger.sayHello();
//    }
//
//    public static void saySmth(Monkey monkey){
//        monkey.sayHello();
//    }
}
