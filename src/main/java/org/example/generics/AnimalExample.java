package org.example.generics;

import org.example.animal.Animal;
import org.example.animal.Lion;
import org.example.animal.Monkey;
import org.example.animal.Tiger;

import java.util.ArrayList;
import java.util.List;

public class AnimalExample {
    public static void main(String[] args) {
        Lion lion = new Lion("lion1", 10, "Africa", 100, "orange");
        Tiger tiger = new Tiger("tiger1", 8, "Africa", 80, "up");
        Monkey monkey = new Monkey("monkey1", 6, "Africa", 40,10);

        Lion lion2 = new Lion("lion2", 10, "Africa", 100, "orange");
        Tiger tiger2 = new Tiger("tiger2", 8,"Africa", 80, "up");
        Monkey monkey2 = new Monkey("monkey2", 4, "Africa", 40, 8);

        List<Lion> lions = new ArrayList<>();
        lions.add(lion);
        lions.add(lion2);

        List<Tiger> tigers = new ArrayList<>();
        tigers.add(tiger);
        tigers.add(tiger2);

        List<Monkey> monkeys = new ArrayList<>();
        monkeys.add(monkey);
        monkeys.add(monkey2);

        iterateAnimalsExtends(lions);
        iterateAnimalsExtends(tigers);
        iterateAnimalsExtends(monkeys);
//        List<Animal> animals = new ArrayList<>();
//        animals.add(lion);
//        animals.add(tiger);
//        animals.add(monkey);
//
//        iterateAnimals(animals);
    }

    /**
     * Lion наследуется от Animal
     * но List<Lion> не наследуется от List<Animal>
     *
     * wildcard представляет из себя знак вопроса ?
     * конструкция extends говорит нам о том, что метод принимает на вход коллекцию (лист) объектов
     * класса Animal либо объектов любого класса-наследника от Animal
     */
    public static void iterateAnimalsExtends(List<? extends Animal> animals){
        for (Animal animal : animals) {
            System.out.println("one more step has passed");
        }
    }

    /**
     * List<? super Lion> animals такая конструкция говорит компилятору, что данный метод может принимать на вход
     * коллекцию объектов Lion либо другого класса-родителя от Lion
     *
     */
    public static void iterateAnimalsSuper(List<? super Lion> animals){
        for (int i = 0; i < animals.size(); i++) {
            System.out.println("one more step has passed");
        }
    }
}
