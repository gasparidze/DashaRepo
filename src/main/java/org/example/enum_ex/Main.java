package org.example.enum_ex;

public class Main {
    public static void main(String[] args) {
        Status active = Status.ACTIVE;
        System.out.println(active);

        String activeName = active.name();
        System.out.println(activeName);
        System.out.println(active.getName());
    }
}
