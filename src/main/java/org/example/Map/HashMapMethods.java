package org.example.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapMethods {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        // Добавление элементов в мар
        map.put(1000, "Kostya");
        map.put(7567, "Mark");
        map.put(9045, "Anton");
        map.put(3452, "Kolya");
        map.put(6546, "Kolya");
        map.put(7567, "Markus");
        map.put(null, "Mazafaker"); // Можно добавить элемент с ключом null
        System.out.println(map); // {null=Mazafaker, 6546=Kolya, 9045=Anton, 1000=Kostya, 3452=Kolya, 7567=Markus}

        // Добавление элемента, в случае, если такого элемента нет
        map.putIfAbsent(5864, "Egor");
        map.putIfAbsent(9045, "Dmitrii");
        System.out.println(map); // {null=Mazafaker, 6546=Kolya, 9045=Anton, 1000=Kostya, 5864=Egor, 3452=Kolya, 7567=Markus}

        // Получение значения по ключу
        System.out.println(map.get(5864)); // Egor
        System.out.println(map.get(4578)); // null

        // Удаление элемента по ключу
        map.remove(9045);
        System.out.println(map); // {null=Mazafaker, 6546=Kolya, 1000=Kostya, 5864=Egor, 3452=Kolya, 7567=Markus}

        // Проверка наличия значения в map
        System.out.println(map.containsValue("Kolya")); // true
        System.out.println(map.containsValue("Vanya")); // false

        // Проверка наличия ключа в map
        System.out.println(map.containsKey(3452)); // true
        System.out.println(map.containsKey(1654)); // false

        // Получение множества ключей
        System.out.println(map.keySet()); // [null, 6546, 1000, 5864, 3452, 7567]

        // Получение множества значений
        System.out.println(map.values()); // [Mazafaker, Kolya, Kostya, Egor, Kolya, Markus]

        for (Map.Entry<Integer, String> entry:
             map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
