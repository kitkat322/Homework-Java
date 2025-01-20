package topic_8.project_8_5;

public class Calculator {
    public static void main(String[] args) {

        /*Завдання 5
Використовуючи IntelliJ IDEA, створіть клас Calculator. Створіть метод з ім'ям calculate,
який приймає як параметри три цілочислові значення та повертає значення кожного аргументу, поділеного на 5.
*/

calculate(10,1,20);

    }
    static void calculate(int arg1, int arg2, int arg3){
        /*if (arg1 <5){
            System.out.println("Перше число не ділиться на 5. Введіть інше значення");
        } else {
            arg1 /= 5;
            System.out.println(arg1);
            if (arg2 <5){
                System.out.println("Друге число не ділиться на 5. Введіть інше значення");
            } else {
                arg2 /= 5;
                System.out.println(arg2);
                if (arg3 <5){
                    System.out.println("Третє число не ділиться на 5. Введіть інше значення");

                } else {
                    arg3 /= 5;
                    System.out.println(arg3);
                }

            }
        }*/

        System.out.println(arg1/5);
        System.out.println(arg2/5);
        System.out.println(arg3/5);
    }
}
