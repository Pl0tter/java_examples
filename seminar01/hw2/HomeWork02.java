package org.example.seminar01.hw2;

import java.util.Scanner;

public class HomeWork02 {
    //    Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
    //    Пример: 1 2 1 2 -1 1 3 1 3 -1 0
    //    2 -1 переход 2 в сумму
    //    3 -1 переход 3 в сумму
    //    суммарно выведет 5
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел N: ");
        int n = scanner.nextInt();
        System.out.println("Введите последовательность N целых чисел: ");
        int num1 = scanner.nextInt();
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            int num2 = scanner.nextInt();
            if (num1 > 0 && num2 < 0) {
                sum += num1;
            }
            num1 = num2;
        }
        scanner.close();
        if (num1 == 0){
            System.out.print("Результат: ");
            System.out.println(sum);
        }
        else{
            System.out.println("Последовательность не оканчивается нулем!");
        }
    }
}
