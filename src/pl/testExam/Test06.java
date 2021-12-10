package pl.testExam;

public class Test06 {
    public static void main(String[] args) {
        System.out.println(replaceStr("Dzien dobry, jak Pani mija dzien?" +
                " Mam nadzieje, ze jest tak przyjemny jak wczorajszy!", "j", "t"));
        System.out.println(replaceStr("Czy czyny czynia czyniacego czynnym wyczynu?", "czy", "przy"));

    }
    public static String replaceStr(String str, String forReplace, String replacement) {
        String text = str;
        String textReplace = text.replaceAll(forReplace, replacement);

        return textReplace;
    }
}
