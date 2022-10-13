package Codewars;
/*
Вам нужно округлить ответ до 2 знаков после запятой и вернуть его в виде строки.
Если заданное значение равно 0, то оно должно возвращать 0.00
В качестве аргументов вам будут даны только натуральные числа.
Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...
1 --> 1 --> "1.00"
2 --> 1 + 1/4 --> "1.25"
5 --> 1 + 1/4 + 1/7 + 1/10 + 1/13 --> "1.57"
 */

public class Sum_of_the_first_nth_term_of_Series {
    public static String seriesSum(int n) {
        double result = 0.00;
        if(n>0) {
            result = 1.00;
            int count = 4;
            for (int i = 1; i<n; i++){
                result = result + 1.00/count;
                count +=3;
            }
        }
        return String.format("%.2f", result); // Вывод double переменной result в виде String с округлением ("%.2f") до 2-х знаков после запятой
    }
    public static void main (String[] args){
        int num = 2;
        System.out.print(seriesSum(num));
    }
}
