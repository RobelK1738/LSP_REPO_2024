package org.howard.edu.lsp.finalexam.question2;

/**
 * Random number strategy using the Linear Congruential Generator algorithm.
 */
public class CustomRNStrategy implements RNStrategy {
    private long seed;
    private static final long MULTIPLIER = 1664525;
    private static final long INCREMENT = 1013904223;
    private static final long MODULUS = (1L << 32); // 2^32

    /**
     * Constructs a new CustomRNStrategy with the current time as the seed.
     */
    public CustomRNStrategy() {
        seed = System.currentTimeMillis();
    }

    @Override
    public int getRandomNumber() {
        seed = (MULTIPLIER * seed + INCREMENT) % MODULUS;
        return (int) (seed & 0x7FFFFFFF) + 1; // Ensure positive integer
    }
}
