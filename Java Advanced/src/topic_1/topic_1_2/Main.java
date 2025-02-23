package topic_1.topic_1_2;

//Виведення на екран елементів List: Створити список, заповнити його на 10 елементів та вивести на екран вміст, використовуючи iterator.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list1.add(i);
        }

        Iterator<Integer> iterator = list1.iterator(); //Метод iterator() вызывается на объекте list1, который является экземпляром класса, реализующего интерфейс List.

        while (iterator.hasNext()){
            Integer integer = iterator.next();
            System.out.println(integer);
        }
    }
}
