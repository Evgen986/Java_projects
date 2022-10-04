package Codewars;

public class SumOfNumbers3 {

    /* РЕШЕНИЕ С КОДВАР
      public int GetSum(int a, int b)
  {
    return (a + b) * (Math.abs(a - b) + 1) / 2;
  }
   */
    public static int GetSum(int a, int b)
    {
        int sum = 0;
        int min = a;
        int max = b;
        if(b<min){
            min=b;
            max=a;
        }
        if (a == b){
            return a;
        }
        for(int i =min; i<=max;i++ ){
            sum += i;
        }
        return sum;
    }


    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 2;
        int num3 = GetSum(num1, num2);

        System.out.println("sum: " + num3);
    }
}
