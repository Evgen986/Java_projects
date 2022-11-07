package Codewars;
import java.util.Arrays;
/*
В этом простом Ката ваша задача - создать функцию, которая превращает строку в мексиканскую волну.
Вам будет передана строка, и вы должны вернуть эту строку в массиве, где заглавная буква - это человек, стоящий.
 1.  The input string will always be lower case but maybe empty.
 2.  If the character in the string is whitespace then pass over it as if it was an empty seat
 wave("hello") => {"Hello", "hEllo", "heLlo", "helLo", "hellO"}
 */

public class MexicanWave {
    /*
    public static String[] wave(String str) {

        String [] array =new String[str.length()];
        for (int i = 0; i < array.length; i++) {
            int j = i;
            if(str.indexOf(' ') == i) j++;
            array[i] = str.substring(0,j) + str.substring(j, j+1).toUpperCase() + str.substring(j+1);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static void main(String[] args) {
        String word = "two words";
        wave(word);
    }

     */
}
