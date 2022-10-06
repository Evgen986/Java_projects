package Codewars;
/*
Consider an array/list of sheep where some sheep may be missing from their place.
We need a function that counts the number of sheep present in the array (true means present).
Рассмотрим массив / список овец, где некоторые овцы могут отсутствовать на своем месте.
Нам нужна функция, которая подсчитывает количество овец, присутствующих в массиве (true означает присутствует)

 */
public class CountingSheep {
/* РЕШЕНИЕ С КОДВАРС
    public int countSheeps(Boolean[] arrayOfSheeps) {
    return Collections.frequency(Arrays.asList(arrayOfSheeps), true);
*/
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int count=0;
        for(int i=0; i<arrayOfSheeps.length; i++){
            if(arrayOfSheeps[i] == null){
                arrayOfSheeps[i] = false;
            }
            if(arrayOfSheeps[i] == true){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        boolean [] array = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true};

    }
}
