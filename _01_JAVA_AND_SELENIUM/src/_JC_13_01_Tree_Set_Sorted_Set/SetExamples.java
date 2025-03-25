package _JC_13_01_Tree_Set_Sorted_Set;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class SetExamples {

    public static void main(String[] args) {

        // HashSet Example
        System.out.println("HashSet Example:");
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Apple"); // Duplicate, will be ignored
        hashSet.add(null); //HashSet allows one null element.

        System.out.println("HashSet: " + hashSet); // Order is not guaranteed

        Iterator<String> hashSetIterator = hashSet.iterator();
        while (hashSetIterator.hasNext()) {
            System.out.println("HashSet Item: " + hashSetIterator.next());
        }

        System.out.println();

        // TreeSet Example
        System.out.println("TreeSet Example:");
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        //treeSet.add(null); //TreeSet does not allow null elements. Will throw a NullPointerException.
        try{
            treeSet.add(null);
        }catch(NullPointerException e){
            System.out.println("TreeSet does not allow null elements.");
        }

        System.out.println("TreeSet: " + treeSet); // Elements are sorted

        Iterator<String> treeSetIterator = treeSet.iterator();
        while (treeSetIterator.hasNext()) {
            System.out.println("TreeSet Item: " + treeSetIterator.next());
        }

        System.out.println();

        // LinkedHashSet Example
        System.out.println("LinkedHashSet Example:");
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        linkedHashSet.add("Apple"); // Duplicate, will be ignored
        linkedHashSet.add(null); //LinkedHashSet allows one null element.

        System.out.println("LinkedHashSet: " + linkedHashSet); // Order is preserved

        Iterator<String> linkedHashSetIterator = linkedHashSet.iterator();
        while (linkedHashSetIterator.hasNext()) {
            System.out.println("LinkedHashSet Item: " + linkedHashSetIterator.next());
        }
    }
}