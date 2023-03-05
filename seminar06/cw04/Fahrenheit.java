package org.example.seminar06.cw04;

public class Fahrenheit implements Converter{
    @Override
    public double convertValue(double val) {
        return val*(9/5)+32;
    }
}
