package org.example.seminar03.cw03;

import java.util.ArrayList;
import java.util.List;

public class Example03 {
    /**
     * Даны следующие сведения о кубиках: размер каждого кубика (длина ребра в целых сантиметрах),
     * его цвет (красный, желтый, зеленый тд) и материал (деревянный, металлический, картонный и тд.).
     * Найти:
     * - количество кубиков желтого цвета и их суммарный объем;
     * - количество деревянных кубиков с ребром 3 см
     *
     * @param args
     */
    public static void main(String[] args) {
        Cube cube1 = new Cube(3, "желтый", "деревянный");
        Cube cube2 = new Cube(3, "зеленый", "металический");
        Cube cube3 = new Cube(4, "красный", "картонный");
        Cube cube4 = new Cube(2, "желтый", "стальной");
        List<Cube> cubeList = new ArrayList<>();
        cubeList.add(cube1);
        cubeList.add(cube2);
        cubeList.add(cube3);
        cubeList.add(cube4);
        System.out.println(cubeList);

        int k = 0;
        int volume = 0;
        int kWood = 0;
        for (int i = 0; i < cubeList.size(); i++) {
            Cube cube = cubeList.get(i);
            if (cube.getColor().equals("желтый")) {
                k++;
                volume += volumeCube(cubeList.get(i).getSize());
            }
            if (cube.getMaterial().equals("деревянный") && cube.getSize() == 3) {
                kWood++;
            }
        }
        System.out.println("1 пункт: " + k + " объем " + volume);
        System.out.println("2 пункт: " + kWood);
    }

    private static Integer volumeCube(Integer size) {
        return size * size * size;
    }
}
