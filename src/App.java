/*
 * Created on 2026-09-30
 *
 * Copyright (c) 2026 Nadine von Frankenberg
 */

// LAB06 template - CMPINF 0401, Fall 2026
// Condensed from the LAB05 sample solution.

/* Simplified for LAB06 */

import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;

public class App {

    public static void main(String[] args) {

        // TODO 1.0: Check the argument's length
        // TODO 1.1: Call readCatsFromFile()

        // TODO 2.3: Check if array is not null,
        // iterate through the array and print the cats
    }

    // TODO 1.1: Implement
    public static /* TODO type */ readCatsFromFile(String fileName) {
        System.out.println("Reading data from file: " + fileName);
        // TODO: Declare an array of cats

        // Try-catch block around reading the csv file
        try (Scanner myScanner = new Scanner(new File(fileName))) {
            // TODO: Skip header line

            // TODO: read each line of the file
            // Hint: you can use line.split(",\\s*");
            // to split a string by a delimiter (String[])

            // TODO: use createCatFromFileData() to create a new cat object from the data read
            // then store it in the cat array

        }
        return null;
    }

    // TODO: Read cat object from file (decide on whether you need a parameter!)
    private static Cat createCatFromFileData() {
        // Hint: use the helper methods below
        // readIntSafely & readStringSafely expect an array, index of the respective
        // value to be parsed, and a default value
        String ownerName = null;
        Owner owner = new Owner(ownerName);

        String name = null;
        int age = -1;
        String story = null;
        int energyLevel = -1;

        Cat cat = new Cat(name, age, story, energyLevel);

        owner.adopt(cat);

        return cat;
    }

    /*
     * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * ! No need to touch the methods below !
     * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     */
    // Helper to safely read a String
    private static String readStringSafely(String[] data, int index, String defaultValue) {
        return (data != null && index < data.length && data[index] != null && !data[index].isEmpty())
                ? data[index].trim()
                : defaultValue;
    }

    // Helper to safely read an int
    private static int readIntSafely(String[] data, int index, int defaultValue) {
        if (data == null || index >= data.length)
            return defaultValue;
        try {
            return Integer.parseInt(data[index].trim());
        } catch (NumberFormatException e) {
            System.out.println("'" + data[index] + "' cannot be interpreted as an int!");
            return defaultValue;
        }
    }
}
