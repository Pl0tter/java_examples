package org.example.seminar04.cw2;

import java.util.LinkedList;
import java.util.Scanner;

public class Example02 {
    /**
     * Построить однонаправленный список целых чисел. Найти сумму четных элементов
     * списка.
     *
     * @param args
     */
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов списка: ");
        int n = scanner.nextInt();
        System.out.print("Введите элементы:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        scanner.close();
        System.out.println(list);
        int sum = 0;
        for (Integer num : list) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println("Сумма четных элементов: " + sum);
    }
}
