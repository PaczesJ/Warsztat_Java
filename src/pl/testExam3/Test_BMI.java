package pl.testExam3;

import java.util.Arrays;

import static pl.testExam3.BMI.history;

public class Test_BMI {
    public static void main(String[] args) {
        BMI bmi1 = new BMI(90, 188);
        BMI bmi2 = new BMI(80, 177);
        BMI bmi3 = new BMI(70, 166);
        BMI bmi4 = new BMI(60, 155);
        BMI bmi5 = new BMI(50, 154);
        BMI bmi6 = new BMI(120, 185);

        bmi1.calculateDouble();
        bmi2.calculateDouble();
        bmi3.calculateDouble();
        bmi4.calculateDouble();
        bmi5.calculateDouble();
        bmi6.calculateDouble();

        System.out.println(Arrays.toString(history));
    }
}
