package org.example.seminar01.cw3;

import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
        /*Дана строка. Поменять местами ее половины.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = scanner.nextLine();
        StringBuilder myNewStr = new StringBuilder();
        myNewStr.append(str.substring(str.length() / 2, str.length())).append(str.substring(0, str.length() / 2));
        System.out.println(myNewStr.toString());
    }
}
