package org.example.seminar06.hw01;

import org.example.seminar06.hw01.model.Notebook;

import java.util.*;

public class View {

    public static int menuShow() {
        HashMap<Integer, String> menu = new HashMap<>(Map.of(
                1, "Добавить ноутбук", 2, "Показать все ноутбуки",
                3, "Выбрать (отфильтровать)", 0, "Выход"));
        for (int i = 0; i < menu.size(); i++) {
            System.out.printf("%d: %s\n", i, menu.get(i));
        }
        System.out.print("Выберите пункт меню: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }

    public static void showAll(Set<Notebook> nbSet) {
        for (Notebook nb : nbSet) {
            System.out.printf("%-6s - RAM: %-2d, HDD: %-4d, OS: %-7s, color: %-7s\n",
                    nb.getBrand(), nb.getRam(), nb.getHdd(), nb.getOs(), nb.getColor());
        }

    }

    public static Notebook addNew(Notebook newNb) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите производителя: ");
        newNb.setBrand(scanner.next());
        System.out.print("Введите объем RAM: ");
        newNb.setRam(scanner.nextInt());
        System.out.print("Введите объем HDD: ");
        newNb.setHdd(scanner.nextInt());
        System.out.print("Введите операционную систему: ");
        newNb.setOs(scanner.next());
        System.out.print("Введите цвет: ");
        newNb.setColor(scanner.next());
        return newNb;
    }

    public static HashMap<String, Object> filterShow() {
        HashMap<Integer, String> menuFilter = new HashMap<>(Map.of(
                1, "Бренд", 2, "Объем RAM",
                3, "Объем HDD", 4, "OS",
                5, "Цвет", 0, "Завершить (применить) фильтр"));
        HashMap<String, Object> filterMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            for (int i = 0; i < menuFilter.size(); i++) {
                System.out.printf("%4d: %s\n", i, menuFilter.get(i));
            }
            System.out.print("Выберите фильтр: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Введите бренд: ");
                    filterMap.put("brand", scanner.next());
                    break;
                case 2:
                    System.out.print("Введите минимальный объем RAM: ");
                    filterMap.put("ram", scanner.nextInt());
                    break;
                case 3:
                    System.out.print("Введите минимальный объем HDD: ");
                    filterMap.put("hdd", scanner.nextInt());
                    break;
                case 4:
                    System.out.print("Введите операционную систему: ");
                    filterMap.put("os", scanner.next());
                    break;
                case 5:
                    System.out.print("Введите цвет: ");
                    filterMap.put("color", scanner.next());
                    break;
            }
        } while (choice != 0);
        return filterMap;
    }
}
