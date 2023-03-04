package org.example.seminar05.hw02;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework02 {
    /**
     * Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет являться ключом)
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/main/java/org/example/seminar05/hw02/text.txt");
        String text = Files.readString(path);
        text = text.replaceAll("\s—\s|\\p{Print}\r\n", " ").replaceAll("\s", "—");
        text = text.replaceAll("[\\p{Punct}&&[^-]]|[«»]|[\r\n]", "");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите искомое слово: ");
        String searchWord = scanner.next().toLowerCase();
        scanner.close();
        Map<String, Integer> mapList = new HashMap<>();
        mapList.put(searchWord, 0);
        for (String word : text.toLowerCase().split("—")) {
            if (word.equals(searchWord)) {
                mapList.put(word, mapList.get(word) + 1);
            }
        }
        System.out.println("Искомое слово встречается " + mapList.get(searchWord) + " раз(а)");
    }
}
