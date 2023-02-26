package org.example.seminar03.hw03;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {

    private String name;
    private String authorSurname;
    private Integer price;
    private Integer year;
    private Integer pages;
}