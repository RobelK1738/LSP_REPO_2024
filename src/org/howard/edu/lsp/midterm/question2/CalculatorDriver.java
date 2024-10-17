package org.howard.edu.lsp.midterm.question2;

/**
 * A driver class to demonstrate the usage of the Calculator class and its
 * overloaded sum methods.
 */
public class CalculatorDriver {
    /**
     * Main method that serves as the entry point of the application.
     * Demonstrates the use of Calculator.sum() methods for different inputs.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Sum of two integers
        System.out.println(Calculator.sum(5, 10)); // Output: 15
        // Sum of two double values
        System.out.println(Calculator.sum(3.5, 7.8)); // Output: 11.3
        // Sum of an array of integers
        System.out.println(Calculator.sum(new int[]{1, 2, 3, 4, 5})); // Output: 15
    }
}
