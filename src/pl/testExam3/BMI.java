package pl.testExam3;

import java.util.Arrays;

public class BMI {
    protected double weight;
    protected double height;
    protected static double[] history = new double[0];



    public BMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }
    public double calculateDouble () {
        double resultBMI = weight/(Math.pow((height/100), 2));
        this.history = addToHistory(resultBMI);
        return resultBMI;
    }
    public double[] addToHistory(double element) {
        history = Arrays.copyOf(history, history.length + 1);
        history[history.length - 1] = element;
        return history;
    }

    @Override
    public String toString() {
        return "BMI{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

}
