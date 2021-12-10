package pl.excercises;

import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x, y, multiplier;
        System.out.println("Input x");
        x=scan.nextInt();
        System.out.println("Input y");
        y=scan.nextInt();
        multiplier=x*y;
        System.out.println("x * y equals: " + multiplier);
    }
}
