package org.example.seminar06.hw01.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@Data

public class Notebook {
    private String brand;
    private Integer ram;
    private Integer hdd;
    private String os;
    private String color;


    public Notebook(ArrayList<Object> newNb) {
        brand = (String) newNb.get(0);
        ram = (Integer) newNb.get(1);
        hdd = (Integer) newNb.get(2);
        os = (String) newNb.get(3);
        color = (String) newNb.get(4);
    }

    public Notebook() {

    }

    public static Set<Notebook> filterSet(Set<Notebook> nbSet, HashMap<String, Object> filterMap) {
        Set<Notebook> nbSetFiltered = new HashSet<>();
        for (Notebook nb : nbSet) {
            if ((filterMap.get("brand") == null || nb.brand.equals(filterMap.get("brand"))) &&
                    (filterMap.get("ram") == null || nb.ram >= (int) filterMap.get("ram")) &&
                    (filterMap.get("hdd") == null || nb.hdd >= (int) filterMap.get("hdd")) &&
                    (filterMap.get("os") == null || nb.os.equals(filterMap.get("os"))) &&
                    (filterMap.get("color") == null || nb.color.equals(filterMap.get("color")))) {
                nbSetFiltered.add(nb);
            }
        }
        return nbSetFiltered;
    }
}
