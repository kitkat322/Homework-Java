package topic_5.topic_5_5;

import java.util.ArrayList;
import java.util.Collections;

public class Friends {
//    Використовуючи Intelij IDEA, створити клас Friends. За допомогою методів ArrayList додати масив імена друзів.
//    Вивести список друзів, після вивести список друзів, відсортувавши в алфавітному порядку.
public static void main(String[] args) {

    ArrayList <String> friends = new ArrayList<>();
    friends.add("Олена");
    friends.add("Марія");
    friends.add("Анна");
    friends.add("Тетяна");
    friends.add("Юлія");
    friends.add("Олеся");

    System.out.println("Перед сортуванням: ");
    System.out.println(friends);

    Collections.sort(friends);
    System.out.println("Після сортування: ");
    System.out.println(friends);

}
}
