package com.pluralsite;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class test {

    public class DemoStart {

        public static void main(String[] arg)
                throws FileNotFoundException {
            try {
                FileReader fileReader = new FileReader("poeem.txt");
                BufferedReader bufReader = new BufferedReader(fileReader);

            }
            catch(Exception ex)
            {
                //  System.out.println(ex);
                System.out.println("File not found");
            }
        }
    }
}
