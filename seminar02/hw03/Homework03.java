package org.example.seminar02.hw03;

import java.util.Arrays;

public class Homework03 {
    /**
     * Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = new int[]{20, -3, 11, 6, -5, 60, 700};
        System.out.println(Arrays.toString(arr));
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (10 <= arr[i] && 99 >= arr[i]) count += i;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) arr[i] = count;
        }
        System.out.println(Arrays.toString(arr));
    }
}
