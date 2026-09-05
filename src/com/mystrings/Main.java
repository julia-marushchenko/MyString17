/**
 *  Java program to remove special characters.
 */

package com.mystrings;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Starting string.
        String s = "I am? an artist.";

        // Display.
        System.out.println(s);

        // Modified string.
        s = s.replaceAll("[^a-zA-Z0-9\\s]", " ");

        // Display.
        System.out.println(s);

    }
}