package topic_5.topic_5_3;

import java.util.ArrayList;
import java.util.Iterator;

public class Zoo {
//    Використовуючи Intelij IDEA, створити проект, пакет.
//    Використовуючи клас Zoo Завдання 2, видалити 3, 5, 7 тварин, дізнатися розмір списку і вивести в консоль.

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

//        animals.remove(3);
//        animals.remove(5);
//        animals.remove(7);

        animals.remove(7);
        animals.remove(5);
        animals.remove(3);

        System.out.println("К-сть тварин у списку після видалення: " + animals.size());

    }
}
