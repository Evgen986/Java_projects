package Codewars;
/*
Given an integral number, determine if it's a square number:
Учитывая целое число, определите, является ли это квадратным числом
-1  =>  false
 0  =>  true
 3  =>  false
 4  =>  true
25  =>  true
26  =>  false
 */
public class Square {
    /* РЕШЕНИЕ С КОДВАРС
        public static boolean isSquare(int n) {
        return Math.sqrt(n) % 1 == 0;
     */
    public static boolean isSquare(int n) {
    double num = Math.sqrt(n);
    System.out.println("num: " + num);
    if((int)num*num == n) {
        return true;
    }else
        return false;
    }
    public static void main(String[] args){
        int num = 80;
        System.out.println("numMain: " + isSquare(num));
    }
}
