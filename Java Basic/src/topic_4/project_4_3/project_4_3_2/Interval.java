package topic_4.project_4_3.project_4_3_2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {

/*Завдання 3
Використовуючи IntelliJ IDEA, створіть клас Interval.
Напишіть програму визначення, чи потрапляє вказане користувачем число від 0 до 100 до числового проміжку
[0 - 14] [15 - 35] [36 - 50][51 - 100]. Якщо так, то вкажіть, в який саме проміжок. Якщо користувач вказує число,
що не входить до жодного з наявних числових проміжків, то виводиться відповідне повідомлення.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть число");
        int a = scan.nextInt();

        /*String b = ((a >= 0) && (a <= 14)) ? "Ваше число від 0 до 14" : ((a >= 15) && (a <= 35)) ? "Ваше число від 15 до 35" : ((a >= 36) && (a <= 50)) ? "Ваше число від 51 до 100" : "Ваше число не входить в діапазон від 0 до 100";
        System.out.println(b);*/

        String b = ((a >= 0) && (a <= 14)) ? "Ваше число від 0 до 14" : ((a >= 15) && (a <= 35)) ? "Ваше число від 15 до 35" : ((a >= 36) && (a <= 50)) ? "Ваше число від 51 до 100" : "Ваше число не входить в діапазон від 0 до 100";
        System.out.println(b);

    }
}
