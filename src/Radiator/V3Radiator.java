package Radiator;

import java.util.ArrayList;

class V3Radiator extends V2Radiator{

    //Конструктор объекта V3Radiator
    V3Radiator(ArrayList lglist){

        /* Метод родителького класа V2Radiator, который обращется к конструктору V2Radiator
           и повторно запускает цикл for из класса V2Radiator.
        */
        super(lglist);


        for(int g=0;g<10;g++){
            lglist.add(new SimUnit("V3радиатор"));
        }
    }
}
