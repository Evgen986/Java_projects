package Codewars;


public class Solution {
    public static boolean check(Object[] a, Object x) {
        java.util.ArrayList<Object> list = new java.util.ArrayList<Object>();
        for (int i=0; i< a.length; i++){
            list.add(a[i]);
        }
        boolean temp = list.contains(x);
        return temp;
    }

    public static void main (String[] args){
        Object [] array = {1, 5, 15, 28};
        System.out.println(check(array, 5));
    }
}

