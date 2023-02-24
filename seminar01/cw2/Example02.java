package org.example.seminar01.cw2;

import java.util.Scanner;

public class Example02 {
    public static void main(String[] args) {
        /*Дана последовательность N целых чисел. Найти количество положительных чисел, после которых следует отрицательное число.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите N: ");
        int n = scanner.nextInt();
        System.out.println("Введите последовательность N целых чисел: ");
        int num1 = scanner.nextInt();
        int count = 0;
        for (int i = 2; i <= n; i++) {
            int num2 = scanner.nextInt();
            if (num1 > 0 && num2 < 0) {
                count++;
            }
            num1 = num2;
        }
        scanner.close();
        System.out.print("Результат: ");
        System.out.println(count);
    }
}
