package com.pluralsight;

public class SuperSayin {

    public String name;
    public int powerlevel;
    public String B

    public void PowerUp(){
        this.powerlevel = this.powerlevel *2;
    }

    public void Stats() {
        System.out.println(this.name + " powerlevel is " + this.powerlevel);
        if(this.powerlevel > 9000)
        {
            System.out.println("Vegeta shouts: ITS OVER 9000!");
        }
    }
    public void Attack(SuperSayin _anySaiyan) {
        _anySaiyan.powerlevel = _anySaiyan.powerlevel -100;
    }


    public void Bean(SuperSayin _anySaiyan) {
        _anySaiyan.powerlevel = _anySaiyan.powerlevel + 400;


    public void Dragonball() {
            System.out.println("Dragonball");
        }
    }
}

