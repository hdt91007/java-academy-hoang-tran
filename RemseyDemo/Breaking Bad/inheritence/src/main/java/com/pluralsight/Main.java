package com.pluralsight;
public class Main {
    public static void main(String[] args) {
        Chemist Jo = new WalterWhite();
        //why swap it to Chemist if using WalterWhite still works
        Jo.Cook();
        Jo.ThisChem();
        Chemist Remesey = new Pinkman();
        Pinkman temp = (Pinkman) Remesey;
        temp.Pikmin();

    }
}
