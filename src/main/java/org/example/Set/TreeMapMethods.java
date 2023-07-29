package org.example.Set;

import java.util.TreeSet;

public class TreeMapMethods {
    public static void main(String[] args) {
        TreeSet<Person> set1 = new TreeSet<>();
        TreeSet<Worker> set2 = new TreeSet<>(new WorkerAgeComparator().thenComparing(new WorkerNameComparator()));

        set1.add(new Person("Kostya", 22));
        set1.add(new Person("Nikita", 28));
        set1.add(new Person("Ilya", 19));
        set1.add(new Person("Masha", 24));
        System.out.println(set1);

        set2.add(new Worker("Kostya", 22));
        set2.add(new Worker("Kostya", 22));
        set2.add(new Worker("Boris", 22));
        set2.add(new Worker("Max", 28));
        System.out.println(set2);
    }
}
