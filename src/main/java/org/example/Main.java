package org.example;
import java.util.*;
import java.util.logging.*;

class Student1 {
    String name;
    int age;
    double gpa;

    public Student1(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getStudentname() {
        return name;
    }

    public void setStudentname(String name) {
        this.name = name;
    }

    public int getStudentage() {
        return age;
    }

    public void setStudentage(int age) {
        this.age = age;
    }

    public double getStudentgpa() {
        return gpa;
    }

    public void setStudentgpa(double gpa) {
        this.gpa = gpa;
    }
}

class sortedGPA implements Comparator<Student1> {
    public int compare(Student1 s1, Student1 s2) {
        if(s2.getStudentgpa() - s1.getStudentgpa()<0){
            return -1;
        }
        else if(s2.getStudentgpa() - s1.getStudentgpa()>0){
            return 1;
        }
        else{
            return 0;
        }
    }
}

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
        Collections.sort(k,new sortedGPA());
        l.info("After sorting:");
        for (Student1 s : k) {
                l.info(s.getStudentname() + " " + s.getStudentage() + " " + s.getStudentgpa());
            }
        }


    }
