package topic_6.project_6_7;

public class Project_6_7_1 {
    public static void main(String[] args) {

        /*Завдання 7
Створіть програму таблиці множення для числа 7, використовуючи цикли. Приклад виведення в консоль:
7 * 1 = 7;
7 * 2 = 14;
…;
7 * 10 = 70.*/

        int a = 7, b = 0, mult = 0;


        while (b<10) {
            mult = a * ++b;
            System.out.println(a + " * " + b + " = " + mult + ";");
        }
    }
}
