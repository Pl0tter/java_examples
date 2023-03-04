package org.example.seminar05.cw01;

import java.util.HashMap;
import java.util.Map;

public class Example01 {
    /**
     * Посчитать количество вхождений каждого символа в текст
     *
     * @param args
     */
    public static void main(String[] args) {
        Map<Character, Integer> mapChar = new HashMap<>();
        String str = "qweasd qwe asdzxc zxc zxc";
        for (int i = 0; i < str.length(); i++) {
            mapChar.putIfAbsent(str.charAt(i), 0);
            mapChar.put(str.charAt(i), mapChar.get(str.charAt(i)) + 1);
//            Через условия
//            if (mapChar.containsKey(str.charAt(i))) {
//                mapChar.put(str.charAt(i), mapChar.get(str.charAt(i)) + 1);
//            } else {
//                mapChar.put(str.charAt(i), 1);
//            }
        }
        for (Map.Entry<Character, Integer> entry :
                mapChar.entrySet()) {
            System.out.printf("%s встретилась %d раз \n", entry.getKey(), entry.getValue());
        }

    }
}
