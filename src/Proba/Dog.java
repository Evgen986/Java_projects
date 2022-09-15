package Proba;

import java.util.ArrayList;

public class Dog {

    private String name;

    public void setName (String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public Dog (String name){
        this.name = name;
    }

    public static void main (String[] args){
        ArrayList<Dog> list1 = new ArrayList<Dog>();

        list1.add(new Dog("Бобик"));
        list1.add(new Dog("Тузик"));
        Dog rex = new Dog("Рекс");
        list1.add(rex);

        list1.add(new Dog("Вульфи"));


        System.out.println(list1.isEmpty());

    }

    public String toString (){
        return ("Dog {"+ "имя ='" + name +'\'' + '}');
    }
}
