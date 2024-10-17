package org.howard.edu.lsp.midterm.question2;

/**
 * Utility class that provides various methods for summing numbers.
 * The sum methods are overloaded to handle two integers, two double values,
 * and an array of integers. All methods are static, allowing usage without
 * creating an instance of the Calculator class.
 */
public class Calculator {
    /**
     * Sums two integers and returns the result.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of the two integers
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * Sums two double values and returns the result.
     *
     * @param a the first double value
     * @param b the second double value
     * @return the sum of the two double values
     */
    public static double sum(double a, double b) {
        return a + b;
    }

    /**
     * Sums all elements in an array of integers and returns the result.
     *
     * @param numbers the array of integers to be summed
     * @return the sum of all integers in the array
     */
    public static int sum(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
}