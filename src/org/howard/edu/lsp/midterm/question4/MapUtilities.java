package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

/**
 * The MapUtilities class provides utility methods for working with HashMaps.
 */
public class MapUtilities {
    /**
     * This method compares two HashMaps and returns the number of common key/value pairs.
     * A common key/value pair is one where both the key and the value match in both HashMaps.
     *
     * @param map1 The first HashMap containing String keys and values.
     * @param map2 The second HashMap containing String keys and values.
     * @return The number of common key/value pairs between map1 and map2.
     *         Returns 0 if either or both of the maps are empty or null.
     */
    public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
        // Check if either map is null or empty
        if (map1 == null || map2 == null || map1.isEmpty() || map2.isEmpty()) {
            return 0;
        }
        int commonPairsCount = 0;
        // Iterate through the key-value pairs of the first map
        for (String key : map1.keySet()) {
            // Check if the second map contains the same key and the same value
            if (map2.containsKey(key) && map1.get(key).equals(map2.get(key))) {
                commonPairsCount++;
            }
        }
        return commonPairsCount;
    }
}

