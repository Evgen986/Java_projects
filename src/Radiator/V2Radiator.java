package Radiator;

import java.util.*;
class V2Radiator {

    // Конструктор объекта V2Radiator
    V2Radiator(ArrayList list){
        for(int x=0;x<5;x++){
            list.add(new SimUnit("V2радиатор"));
        }
    }
}
