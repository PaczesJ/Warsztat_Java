package pl.excercises;

import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        double x, y, z, avg;
        x=in.nextDouble();
        y=in.nextDouble();
        z=in.nextDouble();
        avg = (x*y*z)/3;
        System.out.println("Average = " + avg);
    }
}
