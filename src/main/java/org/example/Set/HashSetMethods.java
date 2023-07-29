package org.example.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetMethods {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        Set<String> set3 = new HashSet<>();

        // Добавление элементов
        set.add("Kostya");
        set.add("Nikita");
        set.add("Mark");
        set.add("Danila");
        set.add("Kostya");
        System.out.println(set); // [Kostya, Nikita, Mark, Danila]

        // Удаление элементов
        set.remove("Danila");
        System.out.println(set); // [Kostya, Nikita, Mark]

        // Размер множества
        System.out.println(set.size()); // 3

        // Проверка на пустоту
        System.out.println(set.isEmpty()); // false

        // Проверка на наличие элемента
        System.out.println(set.contains("Mark")); // true
        System.out.println(set.contains("Markovka")); // false

        // Пересечение
        set2.add("Kostya");
        set2.add("Nikita");
        set2.add("Mark");
        set2.add("Ilya");
        set2.add("Maksim");
        set2.add("Lyuba");
        set2.retainAll(set);
        System.out.println(set2); // [Kostya, Nikita, Mark]

        // Пересечение
        set2.add("Kostya");
        set2.add("Nikita");
        set2.add("Mark");
        set2.add("Ilya");
        set2.add("Maksim");
        set2.add("Lyuba");
        set2.retainAll(set);
        System.out.println(set2); // [Kostya, Nikita, Mark]

        // Объединение
        set3.add("Kostya");
        set3.add("Nikita");
        set3.add("Mark");
        set3.add("Ilya");
        set3.add("Maksim");
        set3.add("Lyuba");
        set3.addAll(set);
        System.out.println(set3); // [Kostya, Lyuba, Nikita, Mark, Ilya, Maksim]

        // Разность
        set3.removeAll(set);
        System.out.println(set3); // [Lyuba, Ilya, Maksim]
    }
}
