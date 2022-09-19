package Radiator;

import java.util.ArrayList;

public class TestLifeSupportSim {
    public static void main(String[] args){
        ArrayList alist = new ArrayList();

        // Создаем новый обект V2Radiator обращаясь к классу V2Radiator в котором
        // стартует цикл for, что приводит к созданию 5 объектов со значением переменной powerUse 2 для каждого,
        // т.к. выполняется условие цикла.
        V2Radiator v2 = new V2Radiator(alist);

        // Создаем новый обект V3Radiator обращаясь к классу V3Radiator в котором
        // в первую очередь выполняется метод super, который наследуется от класса
        // V2Radiator, а значит, что снова выолняется цикл for в классе V2Radiator,
        // и создается еще раз 5 объектов V2Radiator со значением переменной powerUse 4 для каждого,
        // после чего начинает выполняться цикл for класса V3Radiator и создается
        // 10 объектов V3Radiator со значением переменной powerUse 4 для каждого.
        V3Radiator v3 = new V3Radiator(alist);

        // Начинает выполняться цикл for класса TestLifeSupportSim и создается
        // 20 объектов RetentionBot со значением переменной powerUse 2 для каждого.
        for(int z=0;z<20;z++){
            RetentionBot ret=new RetentionBot(alist);
        }

        // Итого суммированое значение переменной powerUse для всех объектов составит 120.
    }
}

