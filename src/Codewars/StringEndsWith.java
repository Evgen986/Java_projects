package Codewars;
/*
Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).
solution('abc', 'bc') // returns true
solution('abc', 'd') // returns false
 */


public class StringEndsWith {
    // РЕШЕНИЕ С КОДВАРС
    public static boolean solution (String str, String ending) {
        return str.endsWith(ending);
    }

    /*public static boolean solution (String str, String ending) {
        boolean temp = false;
        int sumString1 = str.length()-1;
        int sumString2 = ending.length()-1;
        System.out.println("Значение sumString1 " + sumString1);
        System.out.println("Значение sumString2 " + sumString2);
        try {
            if (sumString2 <= sumString1) {
                if(sumString2<0){
                    temp = true;
                }
                for (int i = sumString2; i >= 0; i--) {
                    if (str.charAt(sumString1) == ending.charAt(sumString2)) {
                        sumString1--;
                        sumString2--;
                        temp = true;
                    } else {
                        temp = false;
                        break;
                    }
                }
            }
        }finally {
            return temp;
        }
}
*/
    public static void main (String[] args){
        String one = "fails";
        String two = "ails";
        System.out.print(solution(one, two));
    }
}
