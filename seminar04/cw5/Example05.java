package org.example.seminar04.cw5;

import java.util.Deque;
import java.util.LinkedList;

public class Example05 {
    /**
     * https://leetcode.com/problems/simplify-path/
     *
     * @param args
     */
    public static void main(String[] args) {
        String text = "/home/";
        String text2 = "/../";
        String text3 = "/home//foo/";
        String text4 = "/a//b////c/d//././/..";
        System.out.println(simplifyPath(text));
        System.out.println(simplifyPath(text2));
        System.out.println(simplifyPath(text3));
        System.out.println(simplifyPath(text4));
    }

    private static String simplifyPath(String text) {
        Deque<String> list = new LinkedList<>();
        String[] textArray = text.split("/");
        for (String el : textArray) {
            if (el.equals("") || el.equals("."))
                continue;
            else if (el.equals("..")) {
                if (!list.isEmpty())
                    list.pollLast();
            } else
                list.add(el);
        }

        return "/" + String.join("/", list);
    }
}