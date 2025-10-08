package com.netflix;

import java.io.*;
import java.net.URL;
import java.nio.file.attribute.FileAttribute;

public static void ReadCSVFIle(String _filename) {
    // Load the CSV file from the 'resources' folder using the class loader
    URL resource = SimpleCsvReader.class.getClassLoader().getResource(_filename);

    // If the file is not found, print a message and stop the program
    if (resource == null) {
        System.out.println("File not found!");
        return;
    }

    // Create a File object using the path from the resource URL
    File file = new File(resource.getFile());
    // Try-with-resources: Automatically closes the reader when done
    try (BufferedReader reader = new BufferedReader(new FileReader(""))) {

        //     String[] names = { "Hoang", "Anthony","Zak"};
        //  System.out.println(names[0]);
        String line;
        // Read the file line by line
        while ((line = reader.readLine()) != null) {
            String[] data = line.split("\\|");    //String[] data = { "10","Dana Wyatt","52.50","12.50" }


            //creating variables --> Clear name of what each part is
            int id = Integer.parseInt(data[0]);
            String name = data[1];
            double hours = Double.parseDouble(data[2]);
            double payrate = Double.parseDouble(data[3]);
            double  =

            System.out.println(id);
        }
        catch(IOException e){
            throw new RuntimeException(e);
        }
///System.out.println(id);
            // What do I want to print

            //System.out.println(data[0]); //10


            // System.out.println(data[2]); // 52.50

            // System.out.println(data[3]);


//StringSystem.out.println(id); // 10
            // System.out.println(line.split(|)); // Print each line (CSV row) to the console
}
