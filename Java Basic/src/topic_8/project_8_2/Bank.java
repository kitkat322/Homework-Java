package topic_8.project_8_2;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        /*Завдання 2
Використовуючи IntelliJ IDEA, створіть клас Bank. Уявіть, що ви реалізуєте програму для банку, яка допомагає визначити,
погасив клієнт кредит чи ні. Припустимо, щомісячна сума платежу має становити 100 грн. Клієнт має виконати 7 платежів,
але може платити рідше великими сумами. Тобто може двома платежами по 300 і 400 грн закрити весь борг.

Створіть метод, який як аргумент прийматиме суму платежу, введену економістом банку. Метод виводить на екран інформацію про
стан кредиту (сума заборгованості, сума переплат, повідомлення про відсутність боргу).
*/

        Scanner scan = new Scanner(System.in);
        int payment = scan.nextInt();
        creditStatus(payment);
    }

    static void creditStatus(int arg){
        int credit = 700;
        credit -= arg;

        if (credit>0) {
            System.out.println("Сума заборгованості: " + credit);
        } else if (credit == 0) {
            System.out.println("Борг сплачено");
        } else {
            credit = -credit;
            System.out.println("Сума переплати: " + credit);
        }



    }
}
