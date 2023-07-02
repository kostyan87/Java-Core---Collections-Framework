package org.example.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Kfksk");
        arrayList1.add("JFlfsdlkjdfs");
        arrayList1.add("GKMGKd");
        arrayList1.add(1, "new"); // Добавление элемента по индексу
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>(arrayList1);
        System.out.println(arrayList2); // Содержит те же элементы, что и первый лист
        System.out.println(arrayList1==arrayList2); // Разные объекты

        // Добавление в лист элементов разных типов
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add("string");
        arrayList3.add(45);
        arrayList3.add(56L);
        arrayList3.add(false);
        System.out.println(arrayList3);
    }
}
