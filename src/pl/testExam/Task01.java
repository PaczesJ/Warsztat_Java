package pl.testExam;

import java.util.Scanner;

public class Task01 {
    public static void main (String[] args) {
        rectangle(5, 3);
        rectangle(10, 4);

    }
    public static int rectangle (int a, int b) {
        int x, y, area;

        System.out.println("Dlugosc pierwszego boku");
        x=a;
        System.out.println(a);
        System.out.println("Dlugosc drugiego boku");
        y= b;
        System.out.println(b);
        System.out.println("Pole powierzchni:");
        area=x*y;
        System.out.println(area + "\n");

        return area;

    }
}
