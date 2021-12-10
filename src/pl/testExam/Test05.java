package pl.testExam;

import java.util.Arrays;
import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        System.out.printf("%.2f", sphere());
    }
    public static double sphere() {
        Scanner in = new Scanner(System.in);

        double volume, R, pi;
        pi = Math.PI;
        System.out.println("Podaj długość promienia");
        while(!in.hasNextDouble()) {
            System.out.println("Podaj długość promienia");
            in.next();
        }
        R = in.nextDouble();
        volume = 4.0/3.0 * pi * Math.pow(R, 3);
        System.out.println("Objętość wynosi");
        System.out.println(volume);
        return volume;
    }

}
