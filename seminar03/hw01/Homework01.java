package org.example.seminar03.hw01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Homework01 {
    /**
     * Дан массив записей: наименование товара, цена, сорт.
     * Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
     *
     * @param args
     */
    public static void main(String[] args) {
        Goods item01 = new Goods("Мука пшеничная", 100, 2);
        Goods item02 = new Goods("Мука пшеничная, вЫсший сорт", 120, 1);
        Goods item03 = new Goods("Макароны", 60, 2);
        Goods item04 = new Goods("Говядина тушеная, высшиЙ сорт", 80, 3);
        Goods item05 = new Goods("Хлеб 'Высший вкус'", 40, 1);

        List<Goods> itemList = new ArrayList<>();
        itemList.add(item01);
        itemList.add(item02);
        itemList.add(item03);
        itemList.add(item04);
        itemList.add(item05);

        int maxPrice = 0;
        int maxPriceIndex = 0;
        for (int i = 0; i < itemList.size(); i++) {
            Goods elem = itemList.get(i);
            if (elem.getName().toLowerCase().contains("высший")
                    && (elem.getGrade().equals(1) || elem.getGrade().equals(2))) {
                if (elem.getPrice() > maxPrice) {
                    maxPrice = elem.getPrice();
                    maxPriceIndex = i;

                }
            }
        }
        System.out.println("Максимальная цена: " + maxPrice);
        System.out.println(itemList.get(maxPriceIndex));
    }
}
