package com.pluralsite;

import javax.security.auth.Subject;
import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        System.out.println("Please input either your First and Last name or you First Middle and Last name");
        String Fullname = Scan.nextLine();


        int Space =Fullname.indexOf(" ");
        System.out.println(Space);
        String Fullname2 =Fullname.substring(5);
        String First = Fullname.substring(0,Space);

        System.out.println(First);
    //    Fullname.substring();
    }
}
