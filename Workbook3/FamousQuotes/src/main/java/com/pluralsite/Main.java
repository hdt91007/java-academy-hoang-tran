package com.pluralsite;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        try {
            String[] names = {"The dog of wisdom", "if ball too big", " its not your ball", "Stick are good", "quote 5 ", "quote 6 ", "quote 7 ", "quote 8 ", "quote 9 ", "quote 10 "};
            for (int i = 0; i < 10; ++i) {
                System.out.println(names[i]);
            }
            System.out.println(names[11]);
        } catch (Exception lol) {
            System.out.println("uh oh ");
        }
    }
}

//bonus 1

//bonus 2