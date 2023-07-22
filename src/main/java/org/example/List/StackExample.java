package org.example.List;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Добавление элементов
        stack.push("Kostya");
        stack.push("Mark");
        stack.push("Vlad");
        stack.push("Misha");
        stack.push("Nikita");
        System.out.println(stack);

        // Возвращение и удаление элемента на верху стека
        System.out.println(stack.pop()); // Nikita
        System.out.println(stack); // [Kostya, Mark, Vlad, Misha]

        // Просто возвращение элемента на верху стека
        System.out.println(stack.peek()); // Misha
        System.out.println(stack); // [Kostya, Mark, Vlad, Misha]
    }
}
