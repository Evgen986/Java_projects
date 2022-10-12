package Codewars;
/*
Ваша задача - создать функцию, которая выполняет четыре основные математические операции.
Функция должна принимать три аргумента - operation(строка/символ), value1(число), value2(число).
Функция должна возвращать результат чисел после применения выбранной операции.
('+', 4, 7) --> 11
('-', 15, 18) --> -3
('*', 5, 5) --> 25
('/', 49, 7) --> 7
 */

public class Basic_Mathematical_Operations {
    public static Integer basicMath(String op, int v1, int v2) {
        int result = 0;
        if(op == "+") result = v1 + v2;
        if (op == "-") result = v1 - v2;
        if (op == "*") result = v1 * v2;
        if (op == "/") result = v1 / v2;
        return result;
    }
    public static void main(String[] args){
        System.out.println(basicMath("-", 5,15));
    }
}
