package com.pluralsight;

public class Villians {

    public String name;
    public int health;
    public String outfitcolor;
    public int attackDamage;
    public int power;

    //Constructir parameters

    public void Mojo(String _name, String _outfitcolor) {
        this.name = _name;
        this.outfitcolor = _outfitcolor;
        this.power = 100; // default values
        this.health = 300; // default values
        this.attackDamage = 75; // default values
    }

}