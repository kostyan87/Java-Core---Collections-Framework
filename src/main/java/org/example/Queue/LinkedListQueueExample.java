package org.example.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Добавление элементов в очередь
        // add - выбрасывает исключение при выходе за размер очереди
        // offer - не выбрасывает исключение при выходе за размер очереди
        queue.add("Kostya");
        queue.add("Mark");
        queue.add("Misha");
        queue.offer("Vladimir");
        queue.offer("Nikita");
        System.out.println(queue); // [Kostya, Mark, Misha, Vladimir, Nikita]

        // Возвращение первого элемента в очереди
        System.out.println(queue.element()); // Kostya

        // Удаление и возвращение первого, вошедшего в очередь, элемента
        System.out.println(queue.remove()); // Kostya
        System.out.println(queue.remove()); // Mark
        System.out.println(queue); // [Misha, Vladimir, Nikita]

        // Удаление элемента без выбрасывания исключения в случае пустой очереди
        System.out.println(queue.poll()); // Misha
        System.out.println(queue.poll()); // Vladimir
        System.out.println(queue.poll()); // Nikita
        System.out.println(queue.poll()); // null

        // Возвращение первого элемента в очереди без выбрасывания исключения
        System.out.println(queue.peek());
    }
}
