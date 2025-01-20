package topic_8.project_8_3;

public class Delivery {
    public static void main(String[] args) {

        /*Завдання 3

Є N клієнтів, яким компанія-виробник має доставити товар. Скільки є можливих маршрутів доставлення товару з урахуванням того,
що товар доставлятиме одна машина? Використовуючи IntelliJ IDEA, створіть клас Delivery. Напишіть програму, яка розраховуватиме
та виводитиме на екран кількість можливих варіантів доставлення товару. Для розв'язку задачі, використовуйте факторіал N!,
що розраховується рекурсією. Поясніть, чому не рекомендується використовувати рекурсію для розрахунку факторіала.
Вкажіть слабкі місця цього підходу.
*/

        int clients = 5;
        int deliveryOptions = deliveryOptions(clients);
        System.out.println(deliveryOptions);
    }

    static int deliveryOptions(int arg1) {
        if (arg1 == 0) {
            return 1;
        } else {
            return arg1 * deliveryOptions(arg1-1);
        }
    }

}
