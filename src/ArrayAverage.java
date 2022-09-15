public class ArrayAverage {
    public static void main (String[] args){
        int [] a = {2,5,6,8,7,3,10};

        int sum = 0;
        int index = 0;
        int average = 0;

        for (int i=0; i<a.length; i++){
            sum=sum+a[i];
            index=i;
        }
        average=sum/index;
        System.out.println("Сумма значений массива =" + " " +sum);
        System.out.println("Количество элементов массиве =" + " " +index);
        System.out.println("Среднее арифметическое массива =" + " " +average);
    }
}
