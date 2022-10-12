package Codewars;
/*
Учитывая массив целых чисел, ваше решение должно найти наименьшее целое число.
Given [34, 15, 88, 2] your solution will return 2
 */


public class FindTheSmal_iestInteger_inTheArray {
    public static int findSmallestInt(int[] args) {
        int min = args[0];
        for (int i=0; i< args.length; i++){
            if(args[i]<min){
                min = args[i];
            }
        }
        return min;
    }
}

