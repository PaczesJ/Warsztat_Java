package pl.testExam;

public class Test02 {
    public static void main (String[] args) {
        System.out.println(shorten("Naucz się programować od podstaw", 2));
        System.out.println(shorten("Naucz się programować od podstaw", 5));
        System.out.println(shorten("Naucz się programować od podstaw", 10));

    }
    public static String shorten(String str, int length) {
        String text = str;
        String textShortened = text.substring(0, length);

        return textShortened;
    }
}
