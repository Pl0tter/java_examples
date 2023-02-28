package org.example.seminar04.hw2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class Homework02 {
    /**
     * https://leetcode.com/problems/valid-parentheses/
     *
     * @param args
     */
    public static void main(String[] args) {
        String text = "[](){}";
        System.out.println(isValid(text));
    }

    private static boolean isValid(String text) {
        Deque<Character> dq = new ArrayDeque<>();
        for (char sign : text.toCharArray()) {
            if (!dq.isEmpty()) {
                switch (sign) {
                    case ')':
                        if (dq.peekLast() == '(') {
                            dq.pollLast();
                            break;
                        } else return false;
                    case ']':
                        if (dq.peekLast() == '[') {
                            dq.pollLast();
                            break;
                        } else return false;
                    case '}':
                        if (dq.peekLast() == '{') {
                            dq.pollLast();
                            break;
                        } else return false;
                    default:
                        dq.add(sign);
                }
            } else dq.add(sign);
        }
        return dq.isEmpty();
    }
}
