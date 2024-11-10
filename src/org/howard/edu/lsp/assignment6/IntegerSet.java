package org.howard.edu.lsp.assignment6;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * IntegerSet implementation with exception handling
 */
public class IntegerSet {
    private List<Integer> set = new ArrayList<>();

    public void clear() {
        set.clear();
    }

    public int length() {
        return set.size();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof IntegerSet otherSet) {
            return set.size() == otherSet.set.size() && set.containsAll(otherSet.set);
        }
        return false;
    }

    public boolean contains(int value) {
        return set.contains(value);
    }

    public int largest() throws IntegerSetException {
        if (set.isEmpty()) {
            throw new IntegerSetException("The set is empty");
        }
        return Collections.max(set);
    }

    public int smallest() throws IntegerSetException {
        if (set.isEmpty()) {
            throw new IntegerSetException("The set is empty");
        }
        return Collections.min(set);
    }

    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    public void remove(int item) {
        set.remove((Integer) item);
    }

    public void union(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            this.add(item);
        }
    }

    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    public void complement(IntegerSet intSetb) {
        List<Integer> complementSet = new ArrayList<>(intSetb.set);
        complementSet.removeAll(this.set);
        this.set = complementSet;
    }

    public boolean isEmpty() {
        return set.isEmpty();
    }

    @Override
    public String toString() {
        return set.toString();
    }
}
