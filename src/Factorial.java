public class Factorial {

    public static void main(String[] args){
        int n;

        n=5;
        int result = 1;
        if(n==0){
            System.out.println("Укажите число" +  + result);
        }else {
            for(int i=1;i<=n;i++){
                result=result*i;
            }
            System.out.println(result);
        }
    }
}
