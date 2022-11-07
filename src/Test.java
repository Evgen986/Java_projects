import java.lang.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
//    static String translate(String speech, String[] vocabulary) {
//        String[] array = speech.split(" ");
//        for (int i = 0; i < array.length; i++) {
//            ArrayList<Integer> list = new ArrayList<>();
//            for (int j = 0; j < array[i].length(); j++) {
//                if (Character.getType(array[i].charAt(j)) == 2) list.add(j);
//            }
//            System.out.println(list);
//            for (int j = 0; j < vocabulary.length; j++) {
//                if ()
//            }
//
//
//        }
//        return "";
//    }
//
//

    public static boolean test2(String s){
        Pattern r = Pattern.compile(".*слово.*");
        Matcher n = r.matcher(s);
        return n.matches();
    }
    public static boolean test(String [] s){
        Pattern p = Pattern.compile("(0[1-9]|[12]\\d|3[01])\\.(0[1-9]|1[0-2])\\.(19\\d\\d|20\\d\\d)");
                                    //        дата с 01 по 31      месяц с 01 по 12   год с 1900 по 2099

        for (int i = 0; i < s.length; i++) {
            Matcher m = p.matcher(s[i]);
            if (m.matches()) System.out.println(s[i]);
        }
        return false;
    }

//    public static StringBuilder format (String s, String[] array){
//        StringBuilder formated = new StringBuilder();
//        StringBuilder str = new StringBuilder();
//        String [] array2 = s.split(" ");
//        for (int i = 0; i < array2.length; i++) {
//            str.append(array2[i].replace('*', '.'));
//            int del = str.indexOf("!");
//            System.out.println(del);
//            if(del>0) str.deleteCharAt(del);
//            System.out.println(str);
//            Pattern p = Pattern.compile(".*" + str + ".*");
//            str.delete(0,str.length());
//            for (int j = 0; j < array.length; j++) {
//                System.out.println("В фор");
//                Matcher m = p.matcher(array[j]);
//                if(m.matches()) {
//                    System.out.println(array[j]);
//                    formated.append(array[i]).append(" ");
//                }
//
//            }
//        }
//        return formated;
//    }


    public static void main(String[] args) {
        String words = "***lo w***d!";
        String [] array2 = {"Hello", "world"};
//        String [] array = {"21.10.1999", "12.02.2020", "04.11.2022", "31.13.9999", "51.87.0000"};
        String word = "Hello слово world!";


//        System.out.println(w);

//        System.out.println(test2(word));
//        System.out.println(test(array));
//        System.out.println(translate(words, array));
    }
}
