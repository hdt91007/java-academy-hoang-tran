package com.pluralsight;

import java.util.ArrayList;

public class Celebi {
    public Charzard(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " used flame thrower!");
    }
}

}
