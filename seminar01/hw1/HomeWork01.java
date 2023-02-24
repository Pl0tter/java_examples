package org.example.seminar01.hw1;

public class HomeWork01 {
    //    https://leetcode.com/problems/reverse-words-in-a-string/
    //    Given an input string s, reverse the order of the words.
    //    A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
    //    Return a string of the words in reverse order concatenated by a single space.
    //    Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
    }

    public static String reverseWords(String s) {
        s = " " + s + " ";
        String res = "";
        int indexStart = 0;
        int indexStop;
        while (indexStart < s.length()) {
            if (s.charAt(indexStart) != ' ') {
                indexStop = indexStart + 1;
                while (s.charAt(indexStop) != ' ') {
                    indexStop++;
                }
                res = s.substring(indexStart, indexStop) + res;
                if (indexStop != s.length() - 1) {
                    res = " " + res;
                }
                indexStart = indexStop;
            }
            indexStart++;
        }
        return res;
    }
}
