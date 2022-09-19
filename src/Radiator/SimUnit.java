package Radiator;

public class SimUnit {
    String botType;

    // Конструктор объекта SimUnit

    SimUnit(String type) {
        botType = type;
        System.out.println("Мощность объекта -" + " " +type + " " + "состовляет:" + " " + powerUse());
    }

    // Переменная возвращающая значение мощности (powerUse)
    // возвращает 2 для RetentionBot т.к. идет сравнение при помощи метода equals
    // с параметром "Тепловая машина", для остальных объектов будет ложь, поэтому
    // идем по ветке else и будет возвращаться 4.
    int powerUse() {
        if ("Тепловая машина".equals(botType)) {
            return 2;
        } else {
            return 4;
        }
    }
}

