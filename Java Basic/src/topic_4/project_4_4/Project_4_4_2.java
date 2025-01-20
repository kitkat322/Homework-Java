package topic_4.project_4_4;

import java.util.Scanner;

public class Project_4_4_2 {
    public static void main(String[] args) {

        /*Завдання 4
Дано ціле число. Якщо воно є позитивним, додайте до нього 1; інакше не змінюйте його. Виведіть отримане число.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть будь-яке число");
        int a = scan.nextInt();

        if (a >= 0) System.out.println(++a);
        else System.out.println(a);

    }
}
