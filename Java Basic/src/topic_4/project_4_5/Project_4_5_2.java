package topic_4.project_4_5;

import java.util.Scanner;

public class Project_4_5_2 {
    public static void main(String[] args) {

        /*Завдання 5
Дано ціле число. Якщо воно є позитивним, додайте до нього 1; інакше відніміть із нього 2. Виведіть отримане число. */

        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть будь-яке число");
        int a = scan.nextInt();

        int b = a >= 0 ? ++a : a - 2;
        System.out.println(b);
        //System.out.println(a);

    }


}
