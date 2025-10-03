package com.pluralsight;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
            task t1 = new task("Learn Java");
            System.out.println(t1); // [ ] Learn Java
            t1.complete(true);
            System.out.println(t1); // [✓] Learn Java

            System.out.println("\n \n");
            task[] task = new task[3];
            task [0] = new task("Learn the basics of Classes and Methods in Java");
            task [1] = new task("Fill out this Year Up online form. It's feedback for Yearup about how you guys think the lessons are going. \nhttps://www.surveymonkey.com/r/VXQF92Q.");
            task [2] = new task("Share your most fun exercise we did in class");
            task [1] .complete(true) ;
            for (int i = 0; i < task.length; i++) {
                System.out.println(task[i]);
            }

        }
    }



