package org.example.seminar02.cw01;

import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {
        System.out.printf("Результат: %f", MyPow());
    }

    /**
     * https://leetcode.com/problems/powx-n/
     * Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
     *
     * @return степень
     */
    public static double MyPow() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите основание степени: ");
        double x = scanner.nextDouble();
        System.out.print("Введите показатель степени: ");
        int n = scanner.nextInt();
        scanner.close();
        double result = 1;
        if (n < 0) {
            x = 1 / x;
            n *= -1;
        }
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }
}
