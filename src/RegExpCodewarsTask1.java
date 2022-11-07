public class RegExpCodewarsTask1 {

    public static String purify(String s) {
        String temp = s.replaceAll("(\\S?)([i|I])(\\S?)", "");
        //            заменитьВсё (кроме пробела на один знак)(i мал. и I больш.)(кроме пробела на один знак)
        return temp.replaceAll("\\s+", " ").trim();
        //                    (пробел 1 и более) заменть на " "
    }

    public static void main(String[] args) {
        String text = " W9iBTNp zi fiif 7eI RJii  WF0fJ ";
        System.out.println(purify(text));
    }
}
// nDdxINIiI4IVA5eOcYP70Uig IDGxigKqI
// nDdA5eOcYP70 GK - должно быть
// nDdA5eOcYP70 GK