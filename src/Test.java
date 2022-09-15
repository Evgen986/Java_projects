public class Test {
    public static void main(String[] args) {
        int [] a = {3, 5, 6, 7, 9};
        int sum = 0;
        for (int i=4; i>0; i--){
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
}
