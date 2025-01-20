package topic_1;

public class HiJava {
    public static void main (String[] args) {

        /*Завдання 3
Створіть проект з класом Hi.java. За допомогою методів print та println вивести до консолі наступні фрази
різними методами:
1.      Ваше ім'я.
2.      Ваше прізвище.
Використавши обидва методи, порівняйте їх роботу у консолі.
*/

        String name = "Маргарита";
        String surname = "Чернікова";

        System.out.println(name);
        System.out.println(surname);

        String surname1 = "\nЧернікова";

        System.out.print(name);
        System.out.print(surname1);

    }
}
