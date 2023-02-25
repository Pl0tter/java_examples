package org.example.seminar02.cw04;

public class Example04 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1, 1, 1);
        Vector vector2 = new Vector(1, 2, 1);
        System.out.println(vector1.toString());
        System.out.println("length = " + vector1.length());
        System.out.println("scal = " + vector1.scal(vector2));
        System.out.println("vec prod = " + vector1.vecPr(vector2));
        System.out.println("angle between = " + vector1.angle(vector2));
        System.out.println("sumVec = " + vector1.sumvec(vector2));
        System.out.println("diffVec = " + vector1.diffvec(vector2));
    }
}
