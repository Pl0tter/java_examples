package org.example.seminar03.cw01;

import java.util.ArrayList;
import java.util.List;

public class Example01 {
    /**
     * Даны сведения об экспортируемых товарах:
     * указывается наименование товара, страна, экспортирующая товар, и объем поставляемой партии в штуках.
     * Найти страны, которые экспортируют данный товар, и общий объем его экспорта.
     *
     * @param args
     */
    public static void main(String[] args) {
        Goods good1 = new Goods("qwe", "qew", 3);
        Goods good2 = new Goods("qwe1", "asd1", 3);
        Goods good3 = new Goods("qwe2", "asd2", 3);
        Goods good4 = new Goods("qwe", "zxc", 4);
        List<Goods> goodsList = new ArrayList<>();
        goodsList.add(good1);
        goodsList.add(good2);
        goodsList.add(good3);
        goodsList.add(good4);
        System.out.println(goodsList);
        String searchName = "qwe";
        Integer sumVolume = 0;
        List<String> country = new ArrayList<>();
        for (int i = 0; i < goodsList.size(); i++) {
            if (goodsList.get(i).getName().equals(searchName)) {
                sumVolume += goodsList.get(i).getVolume();
                boolean f = true;
                for (int j = 0; j < country.size(); j++) {
                    if (goodsList.get(i).getCountry().equals(country.get(j))) f = false;
                }
                if (f) country.add(goodsList.get(i).getCountry());
            }
        }
        System.out.println("c = " + country);
        System.out.println("sumVolume = " + sumVolume);
    }
}
