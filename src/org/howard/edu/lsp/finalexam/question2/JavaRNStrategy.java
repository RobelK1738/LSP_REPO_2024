package org.howard.edu.lsp.finalexam.question2;

import java.util.Random;

/**
 * Random number strategy using Java's built-in random number generator.
 */
public class JavaRNStrategy implements RNStrategy {
    private final Random random;

    /**
     * Constructs a new JavaRNStrategy.
     */
    public JavaRNStrategy() {
        random = new Random();
    }

    @Override
    public int getRandomNumber() {
        return random.nextInt(Integer.MAX_VALUE) + 1; // Ensure positive integer
    }
}

