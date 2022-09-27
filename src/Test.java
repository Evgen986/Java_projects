public class Test {

    Integer i=0;
    int j;
    public static void main(String[] args) {
        Test t = new Test();
        t.go();

    }

    public void go(){
        j=i;
        System.out.println(j);
        System.out.println(i);
    }
}
