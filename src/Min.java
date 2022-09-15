public class Min {
    public static void main (String[] args){
        int a = 5;
        int b = 8;
        int c = 3;
        int d = 9;
        int min;

        min=a;
        
        if(a>b){
            min=b;
        } else if (b>c) {
            min=c;
        } else if (c>d) {
            min=d;
        }
        System.out.println("Минимальное значение =" + " " + min);
    }
}
