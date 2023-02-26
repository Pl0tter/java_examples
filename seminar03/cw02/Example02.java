package org.example.seminar03.cw02;

import java.util.ArrayList;
import java.util.List;

public class Example02 {
    /**
     * Дан массив объектов: фамилия студента, номер группы, размер стипендии, баллы по 3 предметам.
     * Определить стипендии студентов, фамилии которых заканчиваются на «ова», при четной сумме баллов.
     *
     * @param args
     */
    public static void main(String[] args) {
        Student st1 = new Student("Павлов", 2, 12000, List.of(4, 5, 3));
        Student st2 = new Student("Попов", 3, 15000, List.of(4, 5, 4));
        Student st3 = new Student("Павлова", 2, 16000, List.of(4, 5, 5));
        Student st4 = new Student("Яковлев", 3, 17000, List.of(4, 3, 4));
        Student st5 = new Student("Смирнова", 2, 12000, List.of(4, 4, 4));
        List<Student> allStudents = new ArrayList<>();
        allStudents.add(st1);
        allStudents.add(st2);
        allStudents.add(st3);
        allStudents.add(st4);
        allStudents.add(st5);

        for (Student student : allStudents) {
            if (nameEnd(student.getNameSecond(), "ова")) {
                int sum = 0;
                for (Integer mark : student.getMarks()) {
                    sum += mark;
                }
                if (sum % 2 == 0) {
                    System.out.println("ФИО: " + student.getNameSecond() + " Стипендия: " + student.getGrant());
                }
            }
        }
    }

    public static boolean nameEnd(String name, String findWord) {
        int charCount = name.length() - findWord.length();
        if (name.substring(charCount).equals(findWord)) return true;
        else return false;
    }
}
