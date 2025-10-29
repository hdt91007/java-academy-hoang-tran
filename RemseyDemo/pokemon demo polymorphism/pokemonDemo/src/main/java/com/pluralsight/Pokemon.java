package com.pluralsight;

public abstract class Pokemon {

    private String energyType;
    private String name;
    private String Nature;
    private String heldItem;

    public String getEnergyType() {
        return energyType;
    }

    public void setEnergyType(String energyType) {
        this.energyType = energyType;
    }

    public String getNature() {
        return Nature;
    }

    public void setNature(String nature) {
        Nature = nature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeldItem() {
        return heldItem;
    }

    public void setHeldItem(String heldItem) {
        this.heldItem = heldItem;
    }

    public Pokemon(String name) {
        this.name = name;
    }
    public abstract void attack();

    }

