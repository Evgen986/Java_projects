import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    static final String text = "china красивая страна. Многие люди посещают Chyna круглый год.";

    public static boolean test(String s){
        Pattern p = Pattern.compile("^Ivan$"); //создали правило
        Matcher m = p.matcher(s); // применили правило к формальному параметру
        return m.matches(); // вернули результат соответсвия строки с правилом
    }

    public static boolean test2(String s){
        Pattern p = Pattern.compile(".+\\.(com|ru|org)"); // создан
        Matcher m = p.matcher(s); // применили правило к формальному параметру
        return m.matches(); // вернули результат соответсвия строки с правилом
    }

    public static void main(String[] args) {
//        System.out.println(test("Ivan"));
//        System.out.println(test("ivan"));
//        System.out.println(test(" Ivan"));
        System.out.println(test2("site.ru"));
//        System.out.println(text.replaceAll("[Cc]h[iy]na", "Россия"));
    }
}
