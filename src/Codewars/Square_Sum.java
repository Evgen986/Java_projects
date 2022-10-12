package Codewars;
/*
Завершите функцию квадратной суммы так, чтобы она возводила в квадрат каждое переданное в нее число,
а затем суммировала результаты вместе.
For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.
 */

public class Square_Sum {
    public static int squareSum(int[] n)
    {
       int result = 0;
       for(int i=0; i<n.length; i++){
           int temp = n[i]*n[i];
           result += temp;
       }
       return result;
    }
    public static void main(String[] args) {
        int [] array = {1,2,2};
        System.out.println(squareSum(array));
    }
}
