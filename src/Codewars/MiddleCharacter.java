package Codewars;

import java.util.Arrays;

/*  You are going to be given a word. Your job is to return the middle character of the word.
    If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.
    Вам будет предоставлено слово. Ваша задача - вернуть средний символ слова. Если длина слова нечетная,
    верните средний символ. Если длина слова четная, верните 2 средних символа.
    Kata.getMiddle("test") should return "es"
    Kata.getMiddle("testing") should return "t"
    Kata.getMiddle("middle") should return "dd"
    Kata.getMiddle("A") should return "A"
 */
public class MiddleCharacter {
    /* РЕШЕНИЕ С КОДВАРС
        public static String getMiddle(String word) {
        int length = word.length();
        return (length % 2 != 0) ?  String.valueOf(word.charAt(length / 2)) : word.substring(length / 2 - 1, length / 2 + 1);
     */
    public static String getMiddle(String word) {
        String nWord;
        if (word.length() % 2 == 0){
            nWord = word.substring(word.length()/2-1, word.length()/2+1);
            System.out.println("Цикл четное " + nWord);
        }else{
            nWord = String.valueOf(word.charAt(word.length()/2));
            System.out.println("Цикл нечетное " + nWord);
        }
        return nWord;
        }
        public static void main (String[] args){
        String word = "Testmtp7";
        System.out.println(getMiddle(word));
        }
}
