package Codewars;

public class ReducebutGrow {
    public static int grow(int[] x){
    int result = x[0];
        for(int i=1; i<x.length; i++){
            result = result * x[i];
    }
        return result;
    }
    public static void main(String [] args){
        int [] array = new int[]{2,2,2,2,2,2};
        System.out.println(grow(array));
    }
}
