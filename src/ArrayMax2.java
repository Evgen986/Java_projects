import java.util.Arrays;

public class ArrayMax2 {
    public static void main(String [] args){
        int [] a = {5,3,15,13,3};
        int max1=a[0];
        int temp = 0;
        for(int i=0; i< a.length-1; i++){
            if(max1<a[i]){
                temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
        int max2=a[0];
        for(int i = 1; i<a.length-1; i++){
            if(max2<a[i]){
                max2=a[i];
            }
        }
        System.out.println("Максимальный значение № 2:" + " " + max2);
        System.out.println(Arrays.toString(a));
    }
}

