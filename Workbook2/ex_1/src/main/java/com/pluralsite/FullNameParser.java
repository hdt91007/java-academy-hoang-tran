package com.pluralsite;

import java.util.Scanner;

public class FullNameParser {
   public static void main(String[] args) {

//        Scanner Scan = new Scanner(System.in);
//        System.out.println("Please input either your First and Last name or you First Middle and Last name");
//        String Fullname = Scan.nextLine();
//
//
//        int Space = Fullname.indexOf(" ");
//        System.out.println(Space);
//        String First = Fullname.substring(0, Space);
//
//        Fullname = Fullname.substring(Space);
//        String Second = Fullname.substring(0, Space);
//        Fullname = Fullname.substring(Space);
//
//
//        String Third = Fullname;
//        int factor = Third.length();
//        System.out.println(factor);
//        if (factor == 0) {
//            System.out.println("First name is " + First.trim());
//            System.out.println("Last name is " + Second.trim());
//
//        } else {
//
//
//            System.out.println("First name is " + First.trim());
//            System.out.println("Middle name is " + Second.trim());
//            System.out.println("Last name is " + Third.trim());
//        }


    }

        public static void LastnameFirstnameFormat(String word) {

            int Space = word.indexOf(" ");
            String First = word.substring(0, Space);

            word = word.substring(Space);
            String Second = word.substring(0, Space);
            word = word.substring(Space);


            String Third = word;
            int factor = Third.length();
            if (factor == 0) {
                System.out.println(Second.trim() + ", "+ First.trim());
            } else {

                System.out.println(Third.trim() + ", "+ Second.trim()+" "+ First.trim());



            }

        }



    }
