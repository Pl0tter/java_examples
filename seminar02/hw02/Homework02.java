package org.example.seminar02.hw02;

import java.util.Scanner;

public class Homework02 {
    /**
     * Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
     *
     * @param args ввод с клавиатуры
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите N: ");
        int n = scanner.nextInt();
        if (n > 1) {
            System.out.println("Введите последовательность: ");
            int num1 = scanner.nextInt();
            int num2 = 0;
            boolean checkMore;
            int i = 1;
            do {
                if (i > 1) num1 = num2;
                num2 = scanner.nextInt();
                i++;
                checkMore = num1 < num2;
            }
            while (checkMore && i < n);
            scanner.close();
            if (checkMore) System.out.println("Возрастает");
            else System.out.println("Не возрастает");
        } else System.out.println("Не последовательность");
    }
}
