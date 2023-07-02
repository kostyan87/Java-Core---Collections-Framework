package org.example.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // Добавление элементов
        list.add("Kostya");
        list.add("Masha");
        list.add("Sergey");

        System.out.println(list); // [Kostya, Masha, Sergey]

        // Получение элемента по индексу
        System.out.println(list.get(1)); // Masha

        // Замена элемента по индексу
        list.set(1, "Maria");
        System.out.println(list); // [Kostya, Maria, Sergey]

        // Удаление элемента по индексу и по значению
        list.remove(1); // [Kostya, Sergey]
        System.out.println(list);
        list.remove("Sergey"); // [Kostya]
        System.out.println(list);

        // Добавление элементов из другого листа
        List<String> list1 = List.of("Nikita", "Lena", "Mark");
        list.addAll(list1);
        System.out.println(list); // [Kostya, Nikita, Lena, Mark]
        list.addAll(0, list1);
        System.out.println(list); // [Nikita, Lena, Mark, Kostya, Nikita, Lena, Mark]

        // Получение позиции объекта
        System.out.println(list.indexOf("Nikita")); // 0
        System.out.println(list.indexOf("Nikitaa")); // -1
        System.out.println(list.lastIndexOf("Nikita")); // 4

        // Получение размера листа
        System.out.println(list.size()); // 7

        // Проверка содержания объекта листом
        System.out.println(list.contains("Mark")); // true
        System.out.println(list.contains("Markk")); // false

        // Проверка содержание листом всех элементов коллекции
        System.out.println(list.containsAll(list1)); // true

        // Получение под-листа
        List<String> list2 = list.subList(1, 4);
        System.out.println(list2);

        // Получение массива
        String[] strings = list.toArray(new String[]{});
        Arrays.stream(strings).forEach(System.out::println);

        // Удаление из одного листа элементов, которые не содержит второй лист
        System.out.println(list); // [Nikita, Lena, Mark, Kostya, Nikita, Lena, Mark]
        list.retainAll(list1);
        System.out.println(list); // [Nikita, Lena, Mark, Nikita, Lena, Mark]

        // Удаление из одного листа элементов другого листа
        System.out.println(list); // [Nikita, Lena, Mark, Kostya, Nikita, Lena, Mark]
        list.removeAll(list1);
        System.out.println(list); // []

        // Проверка списка на пустоту и очистка списка
        System.out.println(list.isEmpty()); // false
        list.clear();
        System.out.println(list.isEmpty()); // true
    }
}
