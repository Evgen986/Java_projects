package Codewars;

import java.util.Arrays;

public class Bubble {
    public static int[] digitize(long n) {
        String numbers = String.valueOf(n);
        System.out.println("numbers: " + numbers);
        int index = numbers.length()-1;
        System.out.println("index: " + index);
        int [] bubble = new int[index+1];
        System.out.println("Перед for: " + Arrays.toString(bubble));
        System.out.println("Первая цифра long: " + numbers.charAt(0));
        for(int i=0; i<=index; i++){
            // В ячейку массива bubble [i] присваеваем через метод преобразования символа char -
            // Character.digit( где: 1 аргумент - символ в строке стринг (index-i), второй аргумент - диапозон
            // целых чисел в который нужно конвертировать - 10)
            bubble[i] = Character.digit(numbers.charAt(index-i), 10);
            System.out.println("В цикле for: " + Arrays.toString(bubble));
        }
    return bubble;
    }
    public static void main (String[]args){
        long num = 654888732;
        System.out.println(Arrays.toString(digitize(num)));
    }
}
