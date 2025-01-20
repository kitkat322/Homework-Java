package topic_6.project_6_9;

import java.util.Scanner;

public class Project_6_9 {
    public static void main(String[] args) {

        /*Завдання 9
Знайдіть послідовність Фібоначчі для заданого діапазону: користувач вводить стартове число та останнє з необхідного діапазону.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть перше число:");
        int a = scan.nextInt();
        System.out.println("Введіть друге число:");
        int b = scan.nextInt();

        int f1 = 1, f2 = 0, f3 = 0;

        while (a < b) {
            ++a;

            for (int i = 0; i<b; i++) {

                    f3 = f1 + f2;  // f3 = 2, 3, 5
                    f1 = f2;       // f1 = 1, 2, 3
                    f2 = f3;

                if (a == f3) {
                    System.out.println(a);
                    break;
                }
            }

                f1 = 1;
                f2 = 0;
                f3 = 0;
        }

    }
}





