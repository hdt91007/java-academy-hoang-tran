package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Bedtimestory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Which story would you like to read?");
        System.out.println("1.Goldilocks and the Three Bears");
        System.out.println("2.Hansel and Gretel");
        System.out.println("3.Mary Had a Lil Lamb");
        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/goldilocks.txt"))) {
                    String line;
                    int i = 0;
                    while ((line = reader.readLine()) != null) {
                        i++;
                        System.out.println(i + "." + line);
                        Thread.sleep(2000); // 1000 milliseconds = 1 second
                    }
                } catch (IOException | InterruptedException e) {
                    throw new RuntimeException(e);
                }
                break;

            case 2:
                try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/hansel_and_gretel.txt"))) {
                    String line;
                    int i = 0;
                    while ((line = reader.readLine()) != null) {
                        i++;
                        System.out.println(i + "." + line);
                        Thread.sleep(2000); // 1000 milliseconds = 1 second
                    }
                } catch (IOException | InterruptedException e) {
                    throw new RuntimeException(e);
                }
                break;
            case 3:
                try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/mary_had_a_little_lamb.txt"))) {
                    String line;
                    int i = 0;
                    while ((line = reader.readLine()) != null) {
                        i++;
                        System.out.println(i + "." + line);
                        Thread.sleep(2000 ); // 1000 milliseconds = 1 second
                    }
                } catch (IOException | InterruptedException e) {
                    throw new RuntimeException(e);

                }
                break;

        }
    }
}