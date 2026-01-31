package org.example.fabric_method.ex1;

public class Server extends Computer{
    @Override
    public int getRam() {
        return 4;
    }

    @Override
    public int getHdd() {
        return 5;
    }

    @Override
    public int getCpu() {
        return 6;
    }
}
