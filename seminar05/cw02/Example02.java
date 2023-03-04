package org.example.seminar05.cw02;

import java.util.HashMap;
import java.util.Map;

public class Example02 {
    /**
     * Определить, есть ли в массиве дубликаты, если найден хоть один, вывести на экран (true).
     * В противном случае (false).
     *
     * @param args
     */
    public static void main(String[] args) {
        Object[] arr = {1, "qwe", 2, 3, 4, 5, 6};
        System.out.println(isExist(arr));
    }

    private static boolean isExist(Object[] arr) {
        Map<Object, Integer> mapList = new HashMap<>();
        for (Object el : arr) {
            if (mapList.containsKey(el)) return true;
            else mapList.put(el, 1);
        }
        return false;
    }
}
