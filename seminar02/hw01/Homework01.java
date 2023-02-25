package org.example.seminar02.hw01;

import java.util.Scanner;

public class Homework01 {
    /**
     * Дана последовательность N целых чисел. Найти сумму простых чисел
     *
     * @param args ввод с клавиатуры
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите N: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int num = scanner.nextInt();
            if (primeCheck(num)) {
                sum += num;
            }
        }
        scanner.close();
        System.out.println("Сумма простых чисел: " + sum);
    }

    public static boolean primeCheck(int n) {
        boolean check = n > 1 && (n % 2 != 0 || n == 2) && (n % 3 != 0 || n == 3);
        int i = 6;
        while (check && (i - 1) * (i - 1) <= n) {
            check = !(n % (i - 1) == 0 || n % (i + 1) == 0);
            i += 6;
        }
        return check;
    }
}
