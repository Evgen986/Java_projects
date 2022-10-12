package Codewars;
/*
Изограмма - это слово, в котором нет повторяющихся букв, последовательных или непоследовательных.
Реализуйте функцию, которая определяет, является ли строка, содержащая только буквы, изограммой.
Предположим, что пустая строка является изограммой. Игнорируйте регистр букв.
"Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignore letter case)
 */

public class Isograms {
    public static boolean isIsogram(String str) {
        String temp = str.toLowerCase();
        boolean result = true;
        for (int i = 0; i < temp.length(); i++) {
            for (int j = i+1; j < temp.length(); j++) {
                if (temp.charAt(i) == temp.charAt(j)) result = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String word = "moOse";
        System.out.println(isIsogram(word));
    }
}
