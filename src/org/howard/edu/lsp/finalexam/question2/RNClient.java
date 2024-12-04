package org.howard.edu.lsp.finalexam.question2;

/**
 * Client program that invokes RNService with different strategies.
 */
public class RNClient {
    /**
     * Main method to run the RNClient.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        RNService service = RNService.getInstance();

        // Use Java's built-in random number generator
        service.setStrategy(new JavaRNStrategy());
        int javaRN = service.getRandomNumber();
        System.out.println("Java Random Number Strategy: " + javaRN);

        // Use custom LCG random number generator
        service.setStrategy(new CustomRNStrategy());
        int customRN = service.getRandomNumber();
        System.out.println("Custom Random Number Strategy: " + customRN);
    }
}
