package org.example.seminar06.cw04;

public class Main {
    /**
     * 4) Напишите интерфейс Converter для конвертации из градусов по Цельсию в
     * Кельвины, Фаренгейты. У классов наследников необходимо переопределить метод интерфейса, для валидного перевода величин. Метод для конвертации назовите "convertValue".
     *
     * ДЗ максимально разделить на отдельные классы. В самом мэйне минимум строк
     * Методы которые проверяют не нужно делать с интами, а возвращать булевое значение
     * Минимум класс ноутбук, мэен класс для общения с пользователем (выбор объема озу и прочее), метод заполнения, метод фильтрация
     * Фильтрация лучше сделать через матчкейс
     *
     * @param args
     */
    public static void main(String[] args) {
        double temp = 37.0;
        System.out.println("Цельсия: " + new Celsius().convertValue(temp));
        System.out.println("Фаренгейты: " + new Fahrenheit().convertValue(temp));
        System.out.println("Кельвины: " + new Kelvin().convertValue(temp));
        System.out.println("Реинюра: " + new Reunyura().convertValue(temp));
    }
}
