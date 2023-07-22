package org.example.Queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(7);
        priorityQueue.add(3);
        priorityQueue.add(22);
        priorityQueue.add(4);

        System.out.println(priorityQueue);

        // Возвращение первого элемента в очереди
        System.out.println(priorityQueue.peek());
    }
}
