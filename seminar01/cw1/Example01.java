package org.example.seminar01.cw1;

import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {
/*      https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/
        Given an integer number n, return the difference between the product of its digits and the sum of its digits.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите N: ");
        int n = scanner.nextInt();
        int sum = 0;
        int pr = 1;
        while (n != 0) {
            pr *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        scanner.close();
        System.out.print("Результат: ");
        System.out.println(pr - sum);
    }

}
