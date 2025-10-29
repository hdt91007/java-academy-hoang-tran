package com.pluralsight;

public class Charzard extends Pokemon {
    public Charzard(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " used flame thrower!");
    }
}

