package org.example.seminar03.cw01;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Goods {

    private String name;
    private String country;
    private Integer volume;
}