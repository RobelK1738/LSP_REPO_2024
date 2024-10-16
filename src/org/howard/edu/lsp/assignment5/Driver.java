package org.howard.edu.lsp.assignment5;

public class Driver {
    public static void main(String[] args) {
        // Test for add, toString, and isEmpty
        IntegerSet set1 = new IntegerSet();
        System.out.println("Is Set1 empty? " + set1.isEmpty()); // true
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("Value of Set1 is: " + set1.toString()); // [1, 2, 3]

        // Test for length
        System.out.println("Length of Set1: " + set1.length()); // 3

        // Test for largest and smallest
        System.out.println("Smallest value in Set1: " + set1.smallest()); // 1
        System.out.println("Largest value in Set1: " + set1.largest()); // 3

        // Test for contains
        System.out.println("Does Set1 contain 2? " + set1.contains(2)); // true
        System.out.println("Does Set1 contain 5? " + set1.contains(5)); // false

        // Test for remove
        set1.remove(2);
        System.out.println("Value of Set1 after removing 2: " + set1.toString()); // [1, 3]

        // Test for union
        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("Value of Set2 is: " + set2.toString()); // [3, 4, 5]
        set1.union(set2);
        System.out.println("Result of union of Set1 and Set2: " + set1.toString()); // [1, 3, 4, 5]

        // Test for intersection
        set1.clear();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.clear();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set1.intersect(set2);
        System.out.println("Result of intersection of Set1 and Set2: " + set1.toString()); // [2, 3]

        // Test for difference
        set1.clear();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.clear();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set1.diff(set2);
        System.out.println("Result of difference of Set1 and Set2: " + set1.toString()); // [1]

        // Test for equals
        set1.clear();
        set1.add(1);
        set1.add(2);
        set2.clear();
        set2.add(1);
        set2.add(2);
        System.out.println("Are Set1 and Set2 equal? " + set1.equals(set2)); // true

        // Test for complement
        set1.clear();
        set1.add(1);
        set1.add(2);
        set2.clear();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set1.complement(set2);
        System.out.println("Result of complement of Set1 and Set2: " + set1.toString()); // [3]

        // Test for clear
        set1.clear();
        System.out.println("Value of Set1 after clearing: " + set1.toString()); // []
    }
}
