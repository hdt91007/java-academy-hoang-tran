package com.pluralsight;

public class PowerpuffGirl {

    private String name;
    private int health;
    private String outfitcolor;
    private int attackDamage;
    private int power;

    //Constructir parameters
    public PowerpuffGirl(String _name, String _outfitcolor) {
        this.name = _name;
        this.outfitcolor = _outfitcolor;
        this.power = 100; // default values
        this.health = 100; // default values
        this.attackDamage = 100; // default values
    }

    public String getName() {
        return this.name;

    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int _newhealth) {
        if (_newhealth > 0 && _newhealth < 100) {
            this.health = _newhealth;
        } else {
            System.out.println("Come on, this is not possible");
        }
    }
        public void Heal(int howmuchhealth){

            System.out.println("Drinking potion");

            int newHealth = this.health + howmuchhealth;
            if (newHealth >= 100) {
                this.setHealth(100);
                System.out.println("Fully recovered");
            } else {
                setHealth(newHealth);
            }

        }

    }