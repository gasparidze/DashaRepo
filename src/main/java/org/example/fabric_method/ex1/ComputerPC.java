package org.example.fabric_method.ex1;

public class ComputerPC extends ComputerFactory{
    @Override
    public Computer getComputer() {
        return new PC();
    }
}
