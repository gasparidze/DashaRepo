package org.example.interface_example;

public class PaperPlane implements Flyable, Flutter{
    @Override
    public void fly() {
        System.out.println("PaperPlane is flying");
    }

    @Override
    public void flutter() {
        System.out.println("paperPlane is fluttered");
    }
}
