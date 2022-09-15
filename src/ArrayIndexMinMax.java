public class ArrayIndexMinMax {
    public static void main(String [] args){
        int [] a = {5,3,15,2,3};

        int max=a[0];
        int indexMax=0;
        int min = a[0];
        int indexMin = 0;

        for(int i = 1; i<a.length; i++){
            if(max<a[i]){
                max=a[i];
                indexMax=i;
            } if (min>a[i]){
                min=a[i];
                indexMin=i;
            }
        }
        System.out.println("Максимальный индекс:" + " " + indexMax);

        System.out.println("Минимальный индекс:" + " " + indexMin);
    }
}
