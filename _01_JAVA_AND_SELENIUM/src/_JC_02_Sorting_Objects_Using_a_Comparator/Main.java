package _JC_02_Sorting_Objects_Using_a_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 23));
        students.add(new Student("Bob", 20));
        students.add(new Student("Charlie", 22));

        // Sorting by age in ascending order
        Collections.sort(students, Comparator.comparingInt(s -> s.age));

        System.out.println(students); 
        // Output: [Bob (20), Charlie (22), Alice (23)]
    }
}
