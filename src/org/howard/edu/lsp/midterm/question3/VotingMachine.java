package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;

/**
 * The VotingMachine class provides a simple electronic voting system.
 * It allows adding candidates, casting votes for candidates, and printing the voting results.
 */
public class VotingMachine {

    // HashMap to store candidates' names as keys and their vote counts as values.
    private HashMap<String, Integer> candidates;

    /**
     * Constructor for the VotingMachine class.
     * Initializes an empty list of candidates.
     */
    public VotingMachine() {
        candidates = new HashMap<>();
    }

    /**
     * Adds a candidate to the list of candidates.
     * If the candidate already exists, no action is taken.
     *
     * @param name The name of the candidate to add.
     */
    public void addCandidate(String name) {
        // If candidate does not already exist, add them with 0 votes.
        if (!candidates.containsKey(name)) {
            candidates.put(name, 0);
        }
    }

    /**
     * Casts a vote for the candidate with the given name.
     * If the candidate does not exist, no action is taken.
     *
     * @param name The name of the candidate to vote for.
     */
    public void castVote(String name) {
        // If the candidate exists, increment their vote count by 1.
        if (candidates.containsKey(name)) {
            candidates.put(name, candidates.get(name) + 1);
        }
    }

    /**
     * Returns a string representation of the voting results.
     * The string contains each candidate's name and their respective number of votes.
     * The order of the candidates does not matter.
     *
     * @return A string showing the vote count for each candidate.
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (String name : candidates.keySet()) {
            result.append(name)
                    .append(": ")
                    .append(candidates.get(name))
                    .append(" votes\n");
        }
        return result.toString();
    }
}
