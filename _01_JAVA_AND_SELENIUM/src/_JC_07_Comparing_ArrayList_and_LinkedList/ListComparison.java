package _JC_07_Comparing_ArrayList_and_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListComparison {
    public static void main(String[] args) {
        // Creating an ArrayList and a LinkedList
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Adding elements
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // Accessing elements (Random Access)
        long startTime = System.nanoTime();
        arrayList.get(50000);  // Fast O(1)
        long endTime = System.nanoTime();
        System.out.println("ArrayList get() time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        linkedList.get(50000);  // Slow O(n)
        endTime = System.nanoTime();
        System.out.println("LinkedList get() time: " + (endTime - startTime) + " ns");

        // Adding at index 5000
        startTime = System.nanoTime();
        arrayList.add(5000, 9999);  // Slow O(n)
        endTime = System.nanoTime();
        System.out.println("ArrayList add(index) time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        linkedList.add(5000, 9999);  // Fast O(1) - O(n)
        endTime = System.nanoTime();
        System.out.println("LinkedList add(index) time: " + (endTime - startTime) + " ns");

        // Removing element at index 5000
        startTime = System.nanoTime();
        arrayList.remove(5000);  // Slow O(n)
        endTime = System.nanoTime();
        System.out.println("ArrayList remove(index) time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        linkedList.remove(5000);  // Fast O(1) - O(n)
        endTime = System.nanoTime();
        System.out.println("LinkedList remove(index) time: " + (endTime - startTime) + " ns");
    }
}