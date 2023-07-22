package org.example.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        // Добавление в начало
        deque.addFirst(4);
        deque.offerFirst(14);
        deque.addFirst(23);
        System.out.println(deque); // [23, 14, 4]

        // Добавление в конец
        deque.offerLast(15);
        deque.addLast(47);
        System.out.println(deque); // [23, 14, 4, 15, 47]

        // Удаление элементов с начала (конца) очереди (pollFirst - без Экзепшена)
        System.out.println(deque.removeFirst()); // 23
        System.out.println(deque.pollLast()); // 47
        System.out.println(deque); // [14, 4, 15]

        // Получение элементов с начала (конца) очереди (peekFirst - без Экзепшена)
        System.out.println(deque.peekFirst()); // 14
        System.out.println(deque.getLast()); // 15
        System.out.println(deque); // [14, 4, 15]
    }
}
