package org.example.seminar05.cw03;

import java.util.HashMap;
import java.util.Map;

public class Example03 {
    /**
     * Написать перевод их Римских цифр в арабские:
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     * Примеры:
     * 1)	ввод: s = "LVIII"
     * вывод: 58
     * разбор: L = 50, V= 5, III = 3.
     * 2)	ввод: s = "MCMXCIV"
     * вывод: 1994
     * разбор: M = 1000, CM = 900, XC = 90 and IV = 4.
     * <p>
     *
     * @param args
     */
    public static void main(String[] args) {
        String text01 = "LVIII";
        String text02 = "MCMXCIV";
        System.out.println(convertArabic(text02));
    }

    private static int convertArabic(String text) {
        Map<Character, Integer> mapList = new HashMap<>();
        mapList.put('I', 1);
        mapList.put('V', 5);
        mapList.put('X', 10);
        mapList.put('L', 50);
        mapList.put('C', 100);
        mapList.put('D', 500);
        mapList.put('M', 1000);
        int sum = mapList.get(text.charAt(text.length() - 1));
        for (int i = 0; i < text.length() - 1; i++) {
            if (mapList.get(text.charAt(i)) < mapList.get(text.charAt(i + 1))) {
                sum -= mapList.get(text.charAt(i));
            } else sum += mapList.get(text.charAt(i));
        }
        return sum;
    }
}

