package Codewars;
/*
Вы живете в городе Картезия, где все дороги проложены по идеальной сетке.
Вы пришли на встречу на десять минут раньше назначенного срока, поэтому решили воспользоваться случаем
и совершить короткую прогулку. Город предоставляет своим гражданам приложение для создания маршрутов на их телефонах
- каждый раз, когда вы нажимаете кнопку, оно отправляет вам массив однобуквенных строк, представляющих направления
для ходьбы (например. ['n', 's', 'w', 'e']). Вы всегда проходите только один квартал для каждой буквы (направления),
и вы знаете, что вам требуется одна минута, чтобы пересечь один городской квартал, поэтому создайте функцию,
которая вернет значение true, если прогулка, которую дает вам приложение, займет у вас ровно десять минут
(вы не хотите приходить рано или поздно!) и, конечно же, вернет вас к вашей отправной точке.
В противном случае верните значение false.
 */

public class TenMinutesWalk {
    public static boolean isValid(char[] walk) {
        int countN = 0;
        int countS = 0;
        int countW = 0;
        int countE = 0;
        for (int i =0; i<walk.length; i++){
            if (walk[i] == 'n') countN++;
            if (walk[i] == 's') countS++;
            if (walk[i] == 'w') countW++;
            if (walk[i] == 'e') countE++;
        }
        if (walk.length != 10) return false;
        else if (countN != countS || countW != countE) return false;
        else return true;
    }
    public static void main (String[] args){
        char [] array = {'n','n','n','n','n','s','s','s','s','s'};
        System.out.println(isValid(array));
    }
}
