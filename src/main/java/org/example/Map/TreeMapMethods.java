package org.example.Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapMethods {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        // Добавление элементов
        map.put(1, "Kostya");
        map.put(2, "Mark");
        map.put(8, "Kolya");
        map.put(3, "Sergey");
        map.put(6, "Nikita");
        System.out.println(map); // {1=Kostya, 2=Mark, 3=Sergey, 6=Nikita, 8=Kolya}

        // Получение элемента
        System.out.println(map.get(5)); // null
        System.out.println(map.get(6)); // Nikita

        // Удаление элемента
        map.remove(6);
        System.out.println(map.get(6)); // null

        // Разворот мар в обратную сторону
        System.out.println(map); // {1=Kostya, 2=Mark, 3=Sergey, 8=Kolya}
        System.out.println(map.descendingMap()); // {8=Kolya, 3=Sergey, 2=Mark, 1=Kostya}

        // Вывод отрезка данных
        System.out.println(map.tailMap(2)); // {2=Mark, 3=Sergey, 8=Kolya}
        System.out.println(map.headMap(2)); // {1=Kostya}

        // Вывод студента с "максимальным (минимальным) ключом"
        System.out.println(map.lastEntry()); // 8=Kolya
        System.out.println(map.firstEntry()); // 1=Kostya
    }
}
