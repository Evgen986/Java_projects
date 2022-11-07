package Codewars;
/* Вы, вероятно, знаете систему "лайков" на Facebook и других страницах. Люди могут "лайкать" записи в блоге,
фотографии или другие элементы. Мы хотим создать текст, который должен отображаться рядом с таким элементом.
Реализуйте функцию, которая принимает массив, содержащий имена людей, которым нравится элемент.
Он должен возвращать отображаемый текст, как показано в примерах:
[]                                -->  "no one likes this"
["Peter"]                         -->  "Peter likes this"
["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
Примечание: Для 4 или более имен число в "и 2 других" просто увеличивается.
 */

public class WhoLikesIt {
    public static String whoLikesIt (String [] names) {
        String result = "";
        if(names.length == 0) result = "no one likes this";
        else if(names.length == 1) result = names[0] + " likes this";
        else if(names.length == 2) result = names[0] + " and " + names[1] + " like this";
        else if(names.length == 3) result = names[0] + ", " + names[1] + " and " + names[2] + " like this";
        else result = names[0] + ", " + names[1] + " and " + Integer.toString(names.length-2) + " others like this";
        return result;
    }

    public static void main (String [] args){
        String [] nam = {"Alex", "Jacob", "Mark", "Max"};
        System.out.println(whoLikesIt(nam));
    }
}
