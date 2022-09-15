import java.util.*;
public class ReversalArray {
    public static void main(String[] args){
    int [] a = {2, 4, 6, 8, 10};

    int temp1 = 0;

    for(int i = 0; i<a.length/2; i++){
        temp1=a[i];
        a[i]=a[a.length-i-1];
        a[a.length-i-1]=temp1;
    }
    System.out.println(Arrays.toString(a));
    }
}
