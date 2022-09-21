package JavaP340;

public class StaticTests extends StaticSuper{
    static int rand;

    static {
        // 2 этап выполнения кода
        rand=(int) (Math.random() * 6);
        System.out.println("Статический блок"+ rand);
    }

    StaticTests (){
        // 6 этап выполнения кода
        System.out.println("Конструктор");
    }

    public static void main(String[] args){

        /*При запуске главного метода в первую очередь идет проверка родительского класса StaticSuper
        в родительском классе выполняется static, далее инициализируется статическая переменная дочернего класса "rand",
        далее выполнение программы переходит к главному методу, когда начинает создаваться объект StaticTest в первую
        очередь идет обращение к конструктору родительского классаЮ затем к дочернему.

         */

        // старт выполнения

        // 3 этап выполнения кода
        System.out.println("Внутри main");
        // 4 этап выполнения кода
        StaticTests st = new StaticTests();
    }
}
