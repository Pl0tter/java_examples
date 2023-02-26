package org.example.seminar03.hw03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Homework02 {
    /**
     * Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
     * Найти названия книг, в которых простое количество страниц,
     * фамилия автора содержит «А» и год издания после 2010 г.(включительно).
     *
     * @param args
     */
    public static void main(String[] args) {
        Book item01 = new Book("Философия Java", "Эккель", 2900, 2022, 1168);
        Book item02 = new Book("Java. Полное руководство", "Шилдт", 3800, 2023, 1344);
        Book item03 = new Book("Java. Эффективное программирование", "Блох", 2200, 2019, 464);
        Book item04 = new Book("Изучаем Java", "Сьерра", 1100, 2020, 31);//pp720

        List<Book> itemList = new ArrayList<>();
        itemList.add(item01);
        itemList.add(item02);
        itemList.add(item03);
        itemList.add(item04);

        for (Book element : itemList) {
            if (primeCheck(element.getPages())
                    && element.getAuthorSurname().toUpperCase().contains("А")
                    && element.getYear() >= 2010) {
                System.out.println(element.getName());
            }
        }
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

