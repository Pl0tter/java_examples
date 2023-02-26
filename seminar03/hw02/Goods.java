package org.example.seminar03.hw02;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Goods {

    private String name;
    private String country;
    private Double weight;
    private Integer price;
    private Integer grade;
}