package pl.excercises;

public class Main15 {
    public static void main(String[] args) {
        int a,b, temporary;
        a= 10;
        b= 20;
        System.out.println("Before swap: " + "a=" + a + " : " + "b=" + b);

        temporary=a;
        a=b;
        b=temporary;
        System.out.println("After swap: " + "a=" + a + " : " + "b="+ b);
    }
}
