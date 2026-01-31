package org.example.fabric_method.ex1;

public class ComputerServer extends ComputerFactory{
    @Override
    public Computer getComputer() {
        return new Server();
    }
}
