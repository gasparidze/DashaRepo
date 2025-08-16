package org.example.animal;

public class MainForZoo {
    public static void main(String[] args) {
        Lion lion1 = new Lion("lion1", 10, "Africa", 100, "orange");
        Tiger tiger1 = new Tiger("tiger1", 8, "Africa", 80, "up");
        Monkey monkey1 = new Monkey("monkey1", 6, "Africa", 40,10);

        Zoo zoo = new Zoo();
        zoo.addAnimal(lion1);
        zoo.addAnimal(tiger1);
        zoo.addAnimal(monkey1);

        zoo.displayInfo();
        zoo.callMakeSound();
    }
}
