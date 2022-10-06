package Codewars;

import java.util.Arrays;

/*
Учитывая массив целых чисел, верните новый массив с удвоением каждого значения.
[1, 2, 3] --> [2, 4, 6]
 */
public class LostWithoutMap {
    /* РЕШЕНИЕ С КОДВАРС
      public static int[] map(int[] arr) {
      return Arrays.stream(arr).map(x -> x*2).toArray();
     */
    public static int[] map(int[] arr) {
    int [] array = new int[arr.length];
    for (int i = 0; i< arr.length; i++){
        array[i] = arr[i]*2;
    }
    return array;
    }
    public static void main(String[] args){
        int [] numbers = {1, 2, 3};
        System.out.println(Arrays.toString(map(numbers)));
    }
}
