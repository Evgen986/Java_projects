package Codewars;
/*
Создайте функцию,
которая принимает целое число в качестве аргумента и возвращает "Четное" для четных чисел
или "Нечетное" для нечетных чисел.
 */
public class EvenOrOdd {
    public static String even_or_odd(int number) {
        String [] parity = {"Even", "Odd"};
        if(number%2==0){
            return parity[0];
        }else {
            return parity[1];
        }
    }

}
