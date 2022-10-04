package Codewars;

public class RemoveStringSpaces {
    public static String noSpace(final String x) {
        return x.replace(" ", "");
    }

    public static void main(String[] args){
        String proba = "8 j 8   mBliB8g  imjB8B8  jl  B";
        System.out.println(noSpace(proba));
    }
}
