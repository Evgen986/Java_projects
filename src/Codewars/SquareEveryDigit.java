package Codewars;
/*
Возведите в квадрат каждую цифру числа и соедините их вместе.
9119 -> 811181
 */

public class SquareEveryDigit {
    public static int squareDigits(int n) {
        String numbers = String.valueOf(n); // Преобразуем n в строку
        String temp = ""; // Создаем временную строку для хранения перебираемых символов строки numbers
        for (int i = 0; i<numbers.length(); i++){ // Цикл для перебора строки numbers
            int num = numbers.charAt(i) - '0'; // Преобразуем символ строки numbers в int-овый тип !!! нужно отнять '0' для корректного значения
            System.out.println(num);
            num=num*num; // Возводим num в квадрат
            temp += num; // В строку temp склеиваем значения num
        }
        int result = Integer.parseInt(temp); // Преобразуем данные строки temp в тип int
        return result;
    }
    public static void main(String[] args){
        int num = 3212;
        System.out.print(squareDigits(num));
    }
}
