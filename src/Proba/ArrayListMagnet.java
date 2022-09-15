package Proba;
import java.util.*;
public class ArrayListMagnet {


    public static void printAL (ArrayList<String> al){
        for (String element : al){
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }
    public static void main (String[] args){
        ArrayList<String> a = new ArrayList<String>();
        a.add(0, "Ноль");
        a.add(1, "Один");
        a.add(2, "Два");
        a.add(3, "Три");

        printAL(a);

        a.remove(2);

        if (a.contains("Три")){
            a.add("Четыре");
        }

        printAL(a);

        if(a.indexOf("Четыре") !=4){
            a.add(4, "4.2");
        }

        printAL(a);
        printAL(a);
    }
}
