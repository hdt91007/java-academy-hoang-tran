package com.pluralsight;

import java.util.Scanner;

public class Pikachu extends Pokemon{
    public Pikachu(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(getName()+" used volt tackle!");
    }
}
