package org.example.seminar06.cw04;

public class Kelvin implements Converter{
    @Override
    public double convertValue(double val) {
        return val+273.15;
    }
}
