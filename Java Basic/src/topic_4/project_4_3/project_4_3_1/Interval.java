package topic_4.project_4_3.project_4_3_1;

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

        if (a >= 0) {
            if (a <= 14) {
                System.out.println("Ваше число від 0 до 14");
            } else if (a >= 15) {
                if (a <= 35) {
                    System.out.println("Ваше число від 15 до 35");
                } else if (a >= 36) {
                    if (a <= 50) {
                        System.out.println("Ваше число від 36 до 50");
                    } else if (a >= 51) {
                        if (a <= 100) {
                            System.out.println("Ваше число від 51 до 100");
                        } else
                            System.out.println("Ваше число не входить в проміжок від 0 до 100. Спробуйте інше число");
                    }
                }
            }
        }


        /*else if (a >= 15 && a <= 35) {
                System.out.println("Ваше число від 15 до 35");
            } else if (a >= 36 && a <= 50) {
                System.out.println("Ваше число від 36 до 50");
            } else if (a >= 51 && a <= 100) {
                System.out.println("Ваше число від 51 до 100");
            } else System.out.println("Ваше число не входить в проміжок від 0 до 100. Спробуйте інше число");*/

        }
    }
