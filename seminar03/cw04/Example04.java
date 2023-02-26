package org.example.seminar03.cw04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Example04 {
    /**
     * Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов
     *
     * @param args
     */
    public static void main(String[] args) {
        Cube cube1 = new Cube(3, "желтый", "деревянный");
        Cube cube2 = new Cube(3, "зеленый", "металический");
        Cube cube3 = new Cube(4, "красный", "картонный");
        Cube cube4 = new Cube(4, "красный", "картонный");
        List<Cube> cubeList = new ArrayList<>();
        cubeList.add(cube1);
        cubeList.add(cube2);
        cubeList.add(cube3);
        cubeList.add(cube4);
        System.out.println(cubeList);
        System.out.println("уникальный список:");
        System.out.println(unicumCollection(cubeList));
    }

    private static Collection unicumCollection(Collection cubeList) {
        return new HashSet(cubeList);
    }

}
