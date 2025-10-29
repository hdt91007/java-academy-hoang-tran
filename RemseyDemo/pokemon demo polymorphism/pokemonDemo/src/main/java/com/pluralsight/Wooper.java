package com.pluralsight;

public class Wooper extends Pokemon {
    public Wooper(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " used Spacial Rend!");
    }
}

