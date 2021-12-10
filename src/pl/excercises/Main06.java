package pl.excercises;

import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) {
        double sum,multiply, substract, divide, remainderOfTwo, x, y;

        Scanner in = new Scanner(System.in);
        x=in.nextDouble();
        y= in.nextDouble();
        sum=x+y;
        multiply=x*y;
        substract=x-y;
        divide=x/y;
        remainderOfTwo=x%y;
        System.out.println("sum = " + sum);
        System.out.println("substract = " + substract);
        System.out.println("multiply = " + multiply);
        System.out.println("divide = " + divide);
        System.out.println("remainderOfTwo = " + remainderOfTwo);
    }
}
