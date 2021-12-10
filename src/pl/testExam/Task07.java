package pl.testExam;

public class Task07 {
    public static void main(String[] args) {
        String str1 = "Wynik dodawania 1 i 2 to 3";
        System.out.println(countNumbers(str1));
        System.out.println(countNumbers("P05ZUK4J I DOD4J UKRYT3 CYFRY"));

    }
    public static int countNumbers(String str) {
        String text = str;
        char[] letters = text.toCharArray();
        int sum =0;

        for(int i=0; i < letters.length;i++) {
            try {
                int num = Integer.parseInt(letters[i] + "");
                sum += num;
            } catch (NumberFormatException e) {

            }
        }return sum;

    }
}
