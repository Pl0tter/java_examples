package org.example.seminar04.cw3;

import java.util.Arrays;
import java.util.LinkedList;

public class Example03 {
    /**
     * Заменить некратные 3 элементы списка, суммой нечетных элементов.
     * 
     * @param args
     */
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(0, 2, 6, 5, 9, 8, 1));

        System.out.println(list);
        int sum = 0;
        for (Integer num : list) {
            if (num % 2 != 0) {
                sum += num;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 != 0)
                list.set(i, sum);
        }
        System.out.println("Сумма нечетных элементов: " + sum);
        System.out.println(list);
    }

}
