package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 * IntergerSet implementation
 */
public class IntegerSet  {
    /**
     * Store the set elements in an ArrayList.
     */
    private List<Integer> set = new ArrayList<>();

    /**
     * Default Constructor
     */
    public IntegerSet() {
    }

    /**
     * Constructor if you want to pass in already initialized
     * @param set the IntergerList to pass in
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }

    /**
     * Clears the internal representation of the set.
     */
    public void clear() {
        set.clear();
    };

    /**
     * Returns the length of the set (number of elements).
     *
     * @return the number of elements in the set
     */
    public int length() {
        return set.size();
    };

    /**
     * Checks if two sets are equal. Two sets are equal if they contain
     * the same values in any order.
     *
     * @param o the object to compare against
     * @return true if the sets are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof IntegerSet otherSet) {
            return set.size() == otherSet.set.size() && set.containsAll(otherSet.set);
        }
        return false;
    };

    /**
     * Returns true if the set contains the specified value.
     *
     * @param value the value to check
     * @return true if the value is in the set, false otherwise
     */
    public boolean contains(int value) {
        return set.contains(value);
    };

    /**
     * Returns the largest element in the set.
     *
     * @return the largest element in the set
     * @throws IllegalStateException if the set is empty
     */
    public int largest()  {
        if (set.isEmpty()) {
            throw new IllegalStateException("The set is empty");
        }
        return Collections.max(set);
    };

    /**
     * Returns the smallest element in the set.
     *
     * @return the smallest element in the set
     * @throws IllegalStateException if the set is empty
     */
    public int smallest()  {
        if (set.isEmpty()) {
            throw new IllegalStateException("The set is empty");
        }
        return Collections.min(set);
    };

    /**
     * Adds an item to the set. If the item already exists, no change is made.
     *
     * @param item the item to be added
     */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    };

    /**
     * Removes an item from the set. If the item does not exist, no change is made.
     *
     * @param item the item to be removed
     */
    public void remove(int item) {
        set.remove((Integer) item);
    }

    /**
     * Performs the union of this set with another set.
     *
     * @param intSetb the second set to union with
     */
    public void union(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            this.add(item);
        }
    }

    /**
     * Performs the intersection of this set with another set.
     * Only elements present in both sets will remain.
     *
     * @param intSetb the second set to intersect with
     */
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    /**
     * Performs the difference between this set and another set.
     * All elements in this set that are not in the other set will remain.
     *
     * @param intSetb the second set to subtract
     */
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    /**
     * Computes the complement of this set relative to another set.
     * After this operation, the set will contain all elements that are in
     * the other set (`intSetb`) but not in this set (`this.set`).
     *
     * @param intSetb the second set to compare against
     */
    public void complement(IntegerSet intSetb) {
        List<Integer> complementSet = new ArrayList<>(intSetb.set);
        complementSet.removeAll(this.set);
        this.set = complementSet;
    }

    /**
     * Returns true if the set is empty.
     *
     * @return true if the set is empty, false otherwise
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * Returns a string representation of the set in the format [1, 2, 3].
     *
     * @return a string representing the set
     */
    @Override
    public String toString() {
        return set.toString();
    }
}

