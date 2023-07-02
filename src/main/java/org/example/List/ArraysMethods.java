package org.example.List;

import java.util.Arrays;
import java.util.List;

public class ArraysMethods {
    public static void main(String[] args) {
        Human[] humans = {new Human("Kostya", "m", 22),
                new Human("Nastya", "w", 25),
                new Human("Ahmed", "m", 24)};

        // Получение списка из массива
        List<Human> humanList1 = Arrays.asList(new Human("Kostya", "m", 22),
                new Human("Nastya", "w", 25),
                new Human("Ahmed", "m", 24));
        List<Human> humanList = Arrays.asList(humans);
        System.out.println(humanList1);

        // Созданный список хранит ссылку на инициализированный массив,
        // поэтому при изменении массива, меняется и список
        humans[1].screamName();
        System.out.println(humanList);
    }
}

class Human {
    private String name;
    private String sex;
    private int age;

    public Human(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public void screamName() {
        this.name = this.name + "!!!";
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
