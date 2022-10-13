package Codewars;

import java.util.Arrays;

/*
Напишите функцию, которая возвращает как минимальное, так и максимальное число данного списка / массива.
[1,2,3,4,5] --> [1,5]
[2334454,5] --> [5,2334454]
[1]         --> [1,1]
 */
public class ArraysMinMax {
    public static int[] minMax(int[] arr) {
        Arrays.sort(arr);
        int [] array = {arr[0], arr[arr.length-1]};
        return array;
    }
    public static void main (String [] args){
        int [] array = {4,3,2,1,5};
        System.out.print(Arrays.toString(minMax(array)));
    }
}
