package Codewars;
/*  Учитывая последовательность слов, вам нужно найти слово, набравшее наибольшее количество баллов.
    Каждая буква слова набирает очки в соответствии с ее положением в алфавите: a = 1, b = 2, c = 3 и т.д.
    Вам нужно вернуть слово с наивысшим баллом в виде строки.
    Если два слова набрали одинаковый балл, верните слово, которое появляется раньше всего в исходной строке.
    Все буквы будут строчными, и все входные данные будут действительными.
 */
/* РЕШЕНИЕ С КОДВАРС
  public static String high(String s) {
    return Arrays.stream(s.split(" "))
                .max(Comparator.comparingInt(
                        a -> a.chars().map(i -> i - 96).sum()
                )).get();
  }
 */
public class HighestScoringWord {
    public static String high(String s) {
        String [] array = s.split(" ");
        String alphbet = "abcdefghijklmnopqrstuvwxyz";
        char [] al = alphbet.toCharArray();
        int print = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            char [] word = array[i].toCharArray();
                for (int j = 0; j < word.length; j++) {
                    for (int k = 0; k < al.length; k++) {
                        if(word[j] == al[k]) {
                            count += k+1;
                        }
                    }
                    if(count>max) {
                        print = i;
                        max = count;
                    }
                }
        }
        return array[print];
    }


    public static void main (String[] args){
        String words = "take me to semynak";
        System.out.println(high(words));
    }
}
