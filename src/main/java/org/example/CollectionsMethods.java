package org.example;

import java.util.*;

public class CollectionsMethods {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 4, 8, 5, 9, 12, 7, 24, -4, -8, 7, 45, -8, 14, 89, -75));

        // Сортировка
        Collections.sort(list);
        System.out.println(list); // [-75, -8, -8, -4, 1, 4, 5, 7, 7, 8, 9, 12, 14, 24, 45, 89]

        // Бинарный поиск
        System.out.println(Collections.binarySearch(list, -4)); // 3

        // Разворот
        Collections.reverse(list);
        System.out.println(list); // [89, 45, 24, 14, 12, 9, 8, 7, 7, 5, 4, 1, -4, -8, -8, -75]

        // Перемешивание
        Collections.shuffle(list);
        System.out.println(list); // [-8, 5, 12, 1, 4, -8, 45, -75, 89, 24, 9, 7, -4, 14, 7, 8]

        // Вставка элементов
        Collections.addAll(list, 1, 2, 5);
        System.out.println(list);
    }
}
