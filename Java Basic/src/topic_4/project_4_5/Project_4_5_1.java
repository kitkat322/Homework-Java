package topic_4.project_4_5;

import java.util.Scanner;

public class Project_4_5_1 {
    public static void main(String[] args) {

        /*Завдання 5
Дано ціле число. Якщо воно є позитивним, додайте до нього 1; інакше відніміть із нього 2. Виведіть отримане число. */

        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть будь-яке число");

        int a = scan.nextInt();

        if (a >= 0) System.out.println(++a);
        else System.out.println(a - 2);

        //System.out.println(a);

    }


}
