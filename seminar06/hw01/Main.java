package org.example.seminar06.hw01;

import org.example.seminar06.hw01.model.Notebook;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Notebook nb01 = new Notebook("Asus", 4, 200, "Windows", "red");
        Notebook nb02 = new Notebook("MSI", 16, 2000, "Windows", "black");
        Notebook nb03 = new Notebook("Apple", 8, 500, "macOS", "silver");
        Notebook nb04 = new Notebook("Lenovo", 8, 1000, "Windows", "grey");
        Set<Notebook> nbSet = new HashSet<>(Arrays.asList(nb01, nb02, nb03, nb04));
        int choice;
        do {
            switch (choice = View.menuShow()) {
                case 1:
                    nbSet.add(View.addNew(new Notebook()));
                    break;
                case 2:
                    View.showAll(nbSet);
                    break;
                case 3:
                    Set<Notebook> nbSetFiltered = Notebook.filterSet(nbSet, View.filterShow());
                    if (nbSetFiltered.isEmpty()) {
                        System.out.println("Таких позиций нет");
                    } else {
                        System.out.println("Данным критериям удовлетворяют следующие позиции:");
                        View.showAll(nbSetFiltered);
                    }
                    break;
            }
        }
        while (choice != 0);
    }
}