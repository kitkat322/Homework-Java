package topic_3.topic_3_2;

import java.util.Scanner;

public class Arithmetic_Average {
    public static void main(String[] args) {

/*
Завдання 2
Використовуючи IntelliJ IDEA, створіть клас Arithmetic Average. Обчисліть середнє арифметичне трьох цілих
значень та виведіть його на екран. З якою проблемою ви зіткнулися? Який тип змінних краще використовуватиме
для коректного показу результату?
*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        int a = scan.nextInt();  // double a = scan.nextInt();

        System.out.print("Введіть друге число: ");
        int b = scan.nextInt();  // double b = scan.nextInt();

        System.out.print("Введіть третє число: ");
        int c = scan.nextInt();  // double c = scan.nextInt();

        // int a = 10, b = 12, c = 14;

        double sum = a + b + c;
        double average = sum / 3;

        System.out.println("Середнє арифметичне: " + average);

    }
}
