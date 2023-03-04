package org.example.seminar05.hw01;

import java.util.HashMap;
import java.util.Map;

public class Homework01 {
    /**
     * Подсчитать количество вхождения каждого слова
     * Пример:
     * Россия идет вперед всей планеты. Планета — это не Россия.
     * toLoverCase().
     *
     * @param args
     */
    public static void main(String[] args) {
        String text = "Россия идет вперед всей планеты. Планета — это не Россия.";
        text = text.replaceAll("\\p{Punct}|\s—", "").replaceAll("\s", "—");
        System.out.println(text);
        Map<String, Integer> mapList = new HashMap<>();
        for (String word : text.toLowerCase().split("—")) {
            mapList.putIfAbsent(word, 0);
            mapList.put(word, mapList.get(word) + 1);
        }
        System.out.println(mapList);
    }
}
