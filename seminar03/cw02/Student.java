package org.example.seminar03.cw02;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Student {
    private String nameSecond;
    private Integer group;
    private Integer grant;
    private List<Integer> marks;
}
