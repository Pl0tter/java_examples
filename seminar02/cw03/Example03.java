package org.example.seminar02.cw03;

import java.util.Scanner;

public class Example03 {
    /**
     * Дан массив целых чисел. Найти количество пар соседних элементов, где первый элемент вдвое больше второго.
     *
     * @param args
     */
    public static void main(String[] args) {
        int k = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int n = scanner.nextInt();
        int[] mass = new int[n];
        System.out.println("Введите массив:");
        for (int i = 0; i < n; i++) {
            mass[i] = scanner.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            if (mass[i] == 2 * mass[i + 1]) {
                k++;
            }
        }
        scanner.close();
        System.out.println("k = " + k);
    }
}
