package Codewars;

import java.util.Arrays;

public class CountByX {
    /*
    assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10}, Kata.countBy(1,10));
    assertArrayEquals(new int[] {2,4,6,8,10}, Kata.countBy(2,5));
    assertArrayEquals(new int[] {3,6,9,12,15,18,21}, Kata.countBy(3,7));
    assertArrayEquals(new int[] {50,100,150,200,250}, Kata.countBy(50,5));
    assertArrayEquals(new int[] {100,200,300,400,500,600}, Kata.countBy(100,6));
     */


    public static int[] countBy(int x, int n){
        int[] multiplication = new int[n];
        for(int i=0; i<n; i++){
            multiplication[i] = x*(i+1);
        }
        return multiplication;
    }

    public static void main (String[] args){
        int x = 50;
        int n = 5;
        int[] array = countBy(x,n);
        System.out.println(Arrays.toString(array));
    }
}
