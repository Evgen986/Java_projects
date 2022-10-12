package Codewars;
/*Поскольку Натан знает, как важно поддерживать гидратацию, он выпивает 0,5 литра воды за час езды на велосипеде.
Вам дается время в часах, и вам нужно вернуть количество литров, которые выпьет Натан, округленное до наименьшего значения.
time = 3 ----> litres = 1
time = 6.7---> litres = 3
time = 11.8--> litres = 5
 */

public class Keep_Hydrated {
    public static int Liters(double time)  {
        int liters = (int) time /2;
        return liters;
    }
public static void main (String[]args){
        System.out.println(Liters(11.8));
}
}
