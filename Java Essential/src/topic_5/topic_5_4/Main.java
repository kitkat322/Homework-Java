package topic_5.topic_5_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
//    Використовуючи Intelij IDEA, створити проект, пакет.
//    Створити клас Main, створити список цілих чисел і за допомогою ListIterator пройтись по списку і збільшити значення на 1.

    public static void main(String[] args) {

        ArrayList <Integer> numbers = new ArrayList<>();

        for (int i = 0; i<5; i++){
            numbers.add(i);
        }

        ListIterator <Integer> listIterator = numbers.listIterator();

        while (listIterator.hasNext()){
            Integer integer = listIterator.next();
            System.out.println(integer);
        }
    }
}
