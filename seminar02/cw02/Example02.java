package org.example.seminar02.cw02;

import java.util.Scanner;

public class Example02 {
    /**
     * Дана последовательность из N целых чисел. Найти сумму чисел, оканчивающихся на 5, перед которыми идет четное число.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите N: ");
        int n = scanner.nextInt();
        System.out.println("Введите целые числа:");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            int num2 = scanner.nextInt();
            if (num % 2 == 0 && num2 % 10 == 5) {
                sum += num2;
            }
            num = num2;
        }
        scanner.close();
        System.out.println(sum);
    }
}
