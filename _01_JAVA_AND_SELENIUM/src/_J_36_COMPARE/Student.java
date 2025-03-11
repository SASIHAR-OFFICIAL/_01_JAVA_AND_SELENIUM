package _J_36_COMPARE;

import java.util.*;

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }
}

// Custom Comparator to sort by ID
class SortById implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.id - s2.id;  // Ascending order
    }
}


