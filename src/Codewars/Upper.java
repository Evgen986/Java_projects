package Codewars;

public class Upper {
    public static String MakeUpperCase(String str){
        String temp = str.toUpperCase();
        return temp;
    }
    public static void main (String[] args){
        String word = "hello";
        System.out.println(MakeUpperCase(word));
    }
}
