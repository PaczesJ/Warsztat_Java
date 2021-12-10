package pl.excercises;

import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long xBinary, yBinary;
        int[] sum = new int[20];
        int i = 0, remainder = 0;

        System.out.print("Input first binary number: ");
        xBinary = in.nextLong();
        System.out.print("Input second binary number: ");
        yBinary = in.nextLong();

        while (xBinary != 0 || yBinary != 0) {
            sum[i++] = (int) ((xBinary % 10 + yBinary % 10 + remainder) % 2);
            remainder = (int) ((xBinary % 10 + yBinary % 10 + remainder) / 2);
            xBinary = xBinary / 10;
            yBinary = yBinary / 10;
        }
        if (remainder != 0) {
            sum[i++] = remainder;
        }
        --i;
        System.out.print("Sum of two binary numbers: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");
    }


}

