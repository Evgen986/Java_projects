package Codewars;

public class GrassHopper {
    public static int summation(int n) {
        int y=0;
        for(int i = 0; i<n; i++){
            int x=1;
            y=y+(x+i);
        }
        return y;
    }
    /* Решение с Кодвар
    public class GrassHopper {
    public static int summation(int n) {
        return  n*(n+1)/2;
    }
}
     */

    public static void main (String[] args){
        int x;
        x=summation(8);
        System.out.println(x);
    }
}
