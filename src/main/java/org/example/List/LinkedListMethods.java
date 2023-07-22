package org.example.List;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMethods {
    public static void main(String[] args) {
        Student[] students = {new Student("Mark", 1),
                new Student("Kostya", 4),
                new Student("Lubomir", 2),
                new Student("Nikita", 3),
                new Student("Vova", 5)};

        List<Student> studentList = new LinkedList<>(Arrays.stream(students).toList());

        System.out.println(studentList);
    }
}

class Student {
    String name;

    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}