package topic_6.project_6_4;

import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {

        /*Завдання 4
Є N клієнтів, яким компанія-виробник має доставити товар. Скільки є можливих маршрутів доставлення товару з урахуванням того,
що товар доставлятиме одна машина? Використовуючи IntelliJ IDEA, створіть клас Delivery. Напишіть програму, яка розраховуватиме
та виводитиме на екран кількість можливих варіантів доставлення товару. Для розв’язку задачі використовуйте факторіал N!,
що розраховується за допомогою циклу do-while.
*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть кількість клієнтів:");
        int n = scan.nextInt();

        int factorial = 1;

        if (n>=0) {

            do {
                factorial *= n--;
            }
            while (n > 0);

            System.out.println("Кількість можливих варіантів доставлення товару: " + factorial);
        } else System.out.println("Неможлива кількість клієнтів. Спробуйте ще раз");

    }

}
