package org.howard.edu.lsp.finalexam.question2;


/**
 * Singleton service for generating random numbers using different strategies.
 */
public class RNService {
    private static RNService instance;
    private RNStrategy strategy;

    /**
     * Private constructor to prevent instantiation.
     */
    private RNService() {
        // Default strategy
        strategy = new JavaRNStrategy();
    }

    /**
     * Returns the singleton instance of RNService.
     *
     * @return the singleton instance
     */
    public static synchronized RNService getInstance() {
        if (instance == null) {
            instance = new RNService();
        }
        return instance;
    }

    /**
     * Sets the random number generation strategy.
     *
     * @param strategy the random number strategy to use
     */
    public void setStrategy(RNStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Generates and returns a positive random integer using the current strategy.
     *
     * @return a positive random integer
     */
    public int getRandomNumber() {
        return strategy.getRandomNumber();
    }
}
