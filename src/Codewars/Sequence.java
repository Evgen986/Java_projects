package Codewars;

import java.util.Arrays;

/*  Build a function that returns an array of integers from n to 1 where n>0.
    Создайте функцию, которая возвращает массив целых чисел от n до 1, где n>0.
    Example : n=5 --> [5,4,3,2,1]
 */
public class Sequence {
    public static int[] reverse(int n) {
        int [] array = new int[n];
        int count = 0;
        for(int s : array){
            array[count] = n;
            n--;
            count++;
        }
/*        int temp = n;
        for (int i = 0; i< array.length; i++){
            array[i] = temp;
            temp--; */

        return array;
    }
    public static void main(String[] args){
        int num = 9;
        System.out.println(Arrays.toString(reverse(9)));
    }
}
