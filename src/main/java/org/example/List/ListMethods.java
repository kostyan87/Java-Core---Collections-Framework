package org.example.List;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
    public static void main(String[] args) {
        // List.of() создает неизменяемый список
        List<Integer> list1 = List.of(3, 8, 13);
        System.out.println(list1);

        // list1.add(100); -> java.lang.UnsupportedOperationException

        // List.copyOf() создает копию из коллекции
        List<Integer> list2 = new ArrayList<>(list1);
        List<Integer> list3 = List.copyOf(list2);
        System.out.println(list3);

        // list3.add(100); -> java.lang.UnsupportedOperationException
    }
}
