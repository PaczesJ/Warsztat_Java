package pl.excercises;

import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        double a, b, area, perimeter;
        Scanner in=new Scanner(System.in);
        a=in.nextDouble();
        b=in.nextDouble();
        perimeter=2*a+2*b;
        area=a*b;
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
    }
}
