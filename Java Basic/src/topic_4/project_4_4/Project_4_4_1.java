package topic_4.project_4_4;

import java.util.Scanner;

public class Project_4_4_1 {
    public static void main(String[] args) {

        /*Завдання 4
Дано ціле число. Якщо воно є позитивним, додайте до нього 1; інакше не змінюйте його. Виведіть отримане число.*/

        Scanner in = new Scanner(System.in);
        System.out.println("Введіть будь-яке число");
        int a = in.nextInt();

        int b = a >= 0 ? ++a : a;
        System.out.println(b); // працює і якщо виводити а і якщо b;
        //System.out.println(a);


    }
}
