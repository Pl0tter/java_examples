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
            Integer num2 = null;
            boolean checkMore;
            do {
                if (num2 != null) num1 = num2;
                n--;
                num2 = scanner.nextInt();
                checkMore = num1 < num2;
            }
            while (checkMore && n > 1);
            scanner.close();
            if (checkMore) System.out.println("Возрастает");
            else System.out.println("Не возрастает");
        } else System.out.println("Не последовательность");
    }
}
