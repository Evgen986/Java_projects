package Comparison;

public class Test {
    public static void main (String [] args){
        int a = 1;
        int b = 8;
        int c = 3;
        int d = 2;
        int e = 6;

        int max = a;

        if (b>max){
            max=b;
        } else {
            return;
        }
        if (c>max){
            max=c;
        } else {
            return;
        }
        if (d>max){
            max=d;
        } else {
            return;
        }
        if (e>max){
            max=e;
        } else {
            return;
        }
        System.out.println("Наиболшее значение =" + " " + max);
    }
}
