package org.example.fabric_method.ex1;

public class PC extends Computer{
    @Override
    public int getRam() {
        return 1;
    }

    @Override
    public int getHdd() {
        return 2;
    }

    @Override
    public int getCpu() {
        return 3;
    }
}
