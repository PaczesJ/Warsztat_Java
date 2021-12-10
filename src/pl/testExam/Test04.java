package pl.testExam;

import java.util.Arrays;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(returnTab()));

    }

    public static int[] returnTab() {

        Scanner in = new Scanner(System.in);
        int element = 0;
        int[] array = new int[0];

        while (element <= 0) {
            System.out.println("Wprowadź liczbę całkowitą większą od 0");
            element = in.nextInt();
        }
        int[] copyOfArray = Arrays.copyOf(array, array.length + element);

        for (int i = 0; i < copyOfArray.length; i++) {
                copyOfArray[i] = i + 1;
        }
        return copyOfArray;
    }
}
