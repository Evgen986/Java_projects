package Codewars;

import java.util.Arrays;

public class Convert_a_string_to_an_array {

    /*
    assertArrayEquals(new String[]{"Robin", "Singh"}, Solution.stringToArray("Robin Singh"));
    assertArrayEquals(new String[]{"I", "love", "arrays", "they", "are", "my", "favorite"}, Solution.stringToArray("I love arrays they are my favorite"));
    */


    public static String[] stringToArray(String s) {
        String [] array = s.split(" ");
        return array;
    }

    public static void main(String [] args){
        String words = "Robin Singh";
        String [] array = stringToArray(words);
        System.out.println(Arrays.toString(array));
    }
}
