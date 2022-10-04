package Codewars;

/*
    public void testSomething() {
        assertEquals("", Kata.countingSheep(0));
        assertEquals("1 sheep...", Kata.countingSheep(1));
        assertEquals("1 sheep...2 sheep...", Kata.countingSheep(2));
        assertEquals("1 sheep...2 sheep...3 sheep...", Kata.countingSheep(3));

 */

import java.util.ArrayList;

public class IfYouCantSleepJustCountSheep {

    /* РЕШЕНИЕ КОДВАР
        public static String countingSheep(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            stringBuilder.append(i).append(" sheep...");
        }
        return stringBuilder.toString();
    }
}
     */

    public static String countingSheep(int num) {
        if(num>0){
            String sheep = "1 sheep...";
            for(int i=2; i<=num;i++) {
                sheep += i + " sheep...";
            }
            return sheep;
        }
        return "";
    }
    public static void main(String[] args){
        int kata = 3;
        System.out.println(countingSheep(kata));
    }
}
