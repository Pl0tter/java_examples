package org.example.seminar03.hw01;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Goods {

    private String name;
    private Integer price;
    private Integer grade;
}