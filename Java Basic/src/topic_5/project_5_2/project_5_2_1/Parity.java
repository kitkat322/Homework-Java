package topic_5.project_5_2.project_5_2_1;

import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {

        /*Завдання 2

Відомо, що в парних числах молодший біт має значення 0. Використовуючи IntelliJ IDEA, створіть клас Parity.
Напишіть програму, яка виконуватиме перевірку чисел на парність. Запропонуйте два варіанти розв'язку поставленого завдання.*/

        Scanner in = new Scanner(System.in);
        System.out.println("Введіть будь-яке число");
        int a = in.nextInt();
        int res = a & 1;

        if (res == 0) {
            System.out.println("Результат = " + res + ", отже, число - " + a + " парне");
        } else System.out.println("Результат = " + res + ", отже, число - " + a + " непарне");

        /* 20 = 0001 0100
            1 = 0000 0001
                0000 0000 - закінчується на 0, отже, парне

           21 = 0001 0101
            1 = 0000 0001
                0000 0001 - - закінчується на 1, отже, непарне
         */


    }
}
