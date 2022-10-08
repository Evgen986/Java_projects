package Codewars;

import java.io.PrintStream;

/*
For example:
"GCAT"  =>  "GCAU"
The input string can be of arbitrary length - in particular, it may be empty.
All input is guaranteed to be valid, i.e. each input string will only ever consist of 'G', 'C', 'A' and/or 'T'.
Входная строка может быть произвольной длины - в частности, она может быть пустой. Все входные данные гарантированно
будут действительными, т.Е. Каждая строка ввода всегда будет состоять только из 'G', 'C', 'A' и /или 'T'.
 */
public class DNAtoRNA {
    /* РЕШЕНИЕ С КОДВАРС
        public String dnaToRna(String dna){
        return dna.replace("T", "U");
     */
    public static String dnaToRna(String dna) {
        char [] array = dna.toCharArray();
        for(int i=0; i<array.length; i++){
            if(array[i] == 'T'){
                array[i] = 'U';
            }
        }
        dna = new String(array);
        return dna;
    }

    public static void main (String[] args){
        String word = "GCAT";

        System.out.println(dnaToRna(word));
    }
}
