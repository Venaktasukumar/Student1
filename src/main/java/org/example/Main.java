package org.example;
import java.util.*;
import java.util.logging.*;

class StudentTest {
    public static void main(String[] args) {
        Logger l = Logger.getLogger("com.api.jar");
        ArrayList<Student1> k = new ArrayList<Student1>();
        try {
            Scanner sc = new Scanner(System.in);
            l.info("Enter the no of students:");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                l.info("Enter student name:");
                String name = sc.next();
                l.info("Enter student age:");
                int age = sc.nextInt();
                l.info("Enter student gpa:");
                double gpa = sc.nextDouble();
                k.add(new Student1(name, age, gpa));
            }
        }
        catch(Exception e){
            l.info("Something went wrong"+ e);
        }
        for (Student1 s : k) {
                l.info(s.getStudentname() + " " + s.getStudentage() + " " + s.getStudentgpa());
            }
        Collections.sort(k,new Sortedgpa());
        l.info("After sorting:");
        for (Student1 s : k) {
                l.info(s.getStudentname() + " " + s.getStudentage() + " " + s.getStudentgpa());
            }
        }


    }
