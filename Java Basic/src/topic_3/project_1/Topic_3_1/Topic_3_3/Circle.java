package Topic_3.project_1.Topic_3_1.Topic_3_3;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

/*
Завдання 3
Використовуючи IntelliJ IDEA, створіть клас Circle. Створіть константу під назвою PI (число π «пі»),
створіть змінну радіус із назвою – r. Використовуючи формулу πR2, обчисліть площу кола та виведіть
результат на екран.
*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Введіть радіус кола: ");
        double r = scan.nextInt();
        final float PI = 3.1415f;
        //byte r = 58;
        double r2 = Math.pow(r, 2);
        double s = PI * r2;

        System.out.println("Площа кола дорівнює: " + s);

    }
}
