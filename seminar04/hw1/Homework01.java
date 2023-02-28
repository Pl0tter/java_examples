package org.example.seminar04.hw1;

import java.util.*;


public class Homework01 {
    /**
     * Вывести список на экран в перевернутом виде (без массивов и ArrayList)
     * Пример:
     * 1->2->3->4
     * Вывод:
     * 4->3->2->1
     *
     * @param args
     */
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < 10; i++) {
            dq.add(i);
        }
        int len = dq.size();
        while (len > 0) {
            dq.push(dq.peekLast());
            System.out.print(dq.pollLast() + " ");
            len--;
        }
    }
}
