package pl.testExam;

import java.util.Arrays;
import java.util.Random;

public class Test03 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(div(10, 100)));
        System.out.println(Arrays.toString(div(5, 20)));
    }
    public static int[] div(int size, int interval) {

        Random rand = new Random();
        int[] array = new int[size];
        int element = 0;

        for (int i=0;i<array.length;i++) {
            while(array[i] == 0) {
                element = rand.nextInt(interval +1);
                if((element%2 == 0) && (element%3 != 0)) {
                    array[i] = element;
                }

            }
        }return array;

    }
}
