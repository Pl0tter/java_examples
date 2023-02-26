package org.example.seminar03.hw02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Homework02 {
    /**
     * Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
     * Получить наименования товаров заданного сорта с наименьшей ценой.
     *
     * @param args
     */
    public static void main(String[] args) {
        Goods item01 = new Goods("Мука пшеничная", "Белоруссия", 1.0, 90, 2);
        Goods item02 = new Goods("Мука пшеничная, вЫсший сорт", "РФ", 1.0, 120, 1);
        Goods item03 = new Goods("Макароны", "Казахстан", 0.9, 80, 2);
        Goods item04 = new Goods("Говядина тушеная, высшиЙ сорт", "РФ", 0.2, 80, 3);
        Goods item05 = new Goods("Хлеб 'Высший вкус'", "РФ", 0.1, 40, 1);

        List<Goods> itemList = new ArrayList<>();
        itemList.add(item01);
        itemList.add(item02);
        itemList.add(item03);
        itemList.add(item04);
        itemList.add(item05);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сорт: ");
        int gradeInput = scanner.nextInt();
        scanner.close();

        List<Goods> itemListFiltered = new ArrayList<>();
        for (Goods elem : itemList) {
            if (elem.getGrade().equals(gradeInput)) itemListFiltered.add(elem);
        }

        int minPrice = itemListFiltered.get(0).getPrice();
        for (Goods elem : itemListFiltered) {
            if (elem.getPrice() < minPrice) minPrice = elem.getPrice();
        }

        Iterator<Goods> itemIterator = itemListFiltered.listIterator();
        while (itemIterator.hasNext()) {
            Goods element = itemIterator.next();
            if (element.getPrice() > minPrice) itemIterator.remove();
        }

        System.out.println("Товары с наименьшей ценой:");
        for (Goods elem : itemListFiltered) System.out.println(elem.getName());
    }
}

