package topic_7.project_7_4;

import java.util.Scanner;

public class NumbersCheck {
    public static void main(String[] args) {

        /*Завдання 4

Використовуючи IntelliJ IDEA, створіть клас NumbersCheck. Напишіть метод, який визначатиме:
1)      чи є введене число позитивним, чи негативним;
2)      чи є воно простим (використовуйте техніку перебору значень).
Просте число – це натуральне число, яке ділиться на 1 й саме на себе.
Щоби визначити просте число чи ні, варто знайти всі його цілі дільники. Якщо дільників більше 2-х,
то воно не просте;
3)      чи ділиться воно на 2, 5, 3, 6, 9 без залишку. */

        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть число:");
        int num = scan.nextInt();

        System.out.println(numberSign(num));
        System.out.println(primeNumber(num));
        System.out.println(divisionWithoutRemainder(num));
    }

    static String numberSign(int arg1) {
        if (arg1 < 0) return "Від'ємне";
        else return "Додатнє";
    }

    static String primeNumber(int arg1) {
        /*if (arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 5 || arg1 == 7) {
            return "Число просте";
        } else if (arg1 % 2 == 0 || arg1 % 3 == 0 || arg1 % 5 == 0 || arg1 % 7 == 0) {
            return "Число не є простим";
        } else return "Число просте";*/

        int amount = 0, div = 0;
        for (int i = 1; i<=arg1; i++){
            if (arg1 % i == 0) amount++;
            else continue;
        }
        if (amount > 2) return "Число не є простим";
        else return "Число просте";
    }


    static String divisionWithoutRemainder(int arg1) {
        if (arg1 % 2 == 0 || arg1 % 5 == 0 || arg1 % 3 == 0 || arg1 % 6 == 0 || arg1 % 9 == 0) {
            return "Ділиться";
        } else return "Не ділиться";
    }
}



