package org.example.seminar04.cw4;

import java.util.Arrays;
import java.util.LinkedList;

public class Example04 {
    /**
     * Построить однонаправленный список целых чисел. Удалить отрицательные элементы
     * списка
     * 
     * @param args
     */
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(0, 2, -6, -5, 9, 8, -1));
        /*
        Вариант удаления с конца
         for (int i = list.size() - 1; i >= 0; i--) {
         if (list.get(i) < 0)
         list.remove(i);
         }
         System.out.println(list);
        */

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
