package org.example.seminar06.cw01;

import java.util.*;

public class Example01 {
    /**
     * Дан массив чисел, посчитать процент уникальных чисел.
     * *процент уникальных чисел =
     * количество уникальных чисел * 100 /
     * общее количество чисел в массиве.
     *
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 2, 1, 5));
        Set<Integer> setList = new HashSet<>(list);
        System.out.printf("Процент уникальных чисел = %d", setList.size() * 100 / list.size());
    }
}
