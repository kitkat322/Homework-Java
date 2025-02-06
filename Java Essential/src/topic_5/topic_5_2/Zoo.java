package topic_5.topic_5_2;

import java.util.ArrayList;
import java.util.Iterator;

public class Zoo {
//    Використовуючи Intelij IDEA, створити проект, пакет. Створити клас Zoo.
//    У класі створити список, який записати 8 тварин через метод add(index, element). Вивести список у консоль.

    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();

        animals.add(0, "Жираф");
        animals.add(1, "Лев");
        animals.add(2, "Олень");
        animals.add(3, "Носоріг");
        animals.add(4, "Папуга");
        animals.add(5, "Дельфін");
        animals.add(6, "Акула");
        animals.add(7, "Пінгвін");

        Iterator<String> iterator = animals.iterator();
        while (iterator.hasNext()){
            String string = iterator.next();
            System.out.println(string);
        }
    }
}
