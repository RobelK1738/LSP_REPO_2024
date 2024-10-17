package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

/**
 * The MapUtilitiesDriver class tests the commonKeyValuePairs method in the MapUtilities class.
 */
public class MapUtilitiesDriver {
    /**
     * The main method that drives the test for the commonKeyValuePairs method.
     * It creates two HashMaps, adds key-value pairs, and then checks how many pairs they have in common.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Create the first HashMap and populate it with key-value pairs
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("Alice", "Healthy");
        map1.put("Mary", "Ecstatic");
        map1.put("Bob", "Happy");
        map1.put("Chuck", "Fine");
        map1.put("Felix", "Sick");

        // Create the second HashMap and populate it with key-value pairs
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("Mary", "Ecstatic");
        map2.put("Felix", "Healthy");
        map2.put("Ricardo", "Superb");
        map2.put("Tam", "Fine");
        map2.put("Bob", "Happy");

        // Calculate the number of common key/value pairs
        int commonPairs = MapUtilities.commonKeyValuePairs(map1, map2);

        // Output the result to the console
        System.out.println("Number of common key/value pairs is: " + commonPairs);
    }
}

