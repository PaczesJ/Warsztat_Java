package pl.excercises;

import java.util.Scanner;

public class Main07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        for(int i=1;i<= 10;i++) {
            System.out.println(x + " x " + i + " = " + x*i);
        }
    }
}
