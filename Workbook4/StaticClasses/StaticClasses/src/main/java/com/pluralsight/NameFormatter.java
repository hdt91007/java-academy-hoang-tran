package com.pluralsight;

import java.util.ArrayList;

public class NameFormatter {
    String firstName;
    String lastName;
    String Prefix;
    String middleName;
    String Suffix;


    private NameFormatter(String firstName, String lastName, String prefix, String middleName, String suffix) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Prefix = prefix;
        this.middleName = middleName;
        this.Suffix = suffix;
    }

    public static String format(String firstName, String lastName) {
return firstName + " " + lastName;}



    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix){
     return  prefix + " " + firstName+ " " +middleName+ " " +lastName+ " " +suffix;
    }

    public static String format(String fullName) {
String[] fullname = fullName.trim().split(" ");
    return fullName;
    }




}
