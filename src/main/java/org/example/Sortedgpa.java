package org.example;

import java.util.Comparator;

class Sortedgpa implements Comparator<Student1> {
    public int compare(Student1 s1, Student1 s2) {
        if (s2.getStudentgpa() - s1.getStudentgpa() < 0) {
            return -1;
        } else if (s2.getStudentgpa() - s1.getStudentgpa() > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
