package com.codegym.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentDatabase {
    public static List<Student> students = new ArrayList<>();

    public static void addStudentInfo(Student student) {
        students.add(student);
        printStudentInfo(student);

    }

    public static void printStudentInfo(Student student) {
        System.out.println("Name: " + student.getName() + " Age: " + student.getAge());
    }

    public static void removeStudent(int index){
        for (int i = 0; i < students.size(); i++) {
            if (i == index) {
                students.remove(i);
            }
        }
    }

    public static void findJohnOrAlex() {
        for (Student student : students) {
            if (student.getName().equals("John")) {
                System.out.println("John is in the student database.");
                break;
            } else if (student.getName().equals("Alex")) {
                System.out.println("Alex is in the student database.");
                break;
            }
        }
    }
}