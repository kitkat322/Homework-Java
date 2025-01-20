package topic_7.project_7_2;

import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {

        /*Завдання 2
Використовуючи IntelliJ IDEA, створіть клас Arithmetics. Створіть чотири методи для виконання арифметичних операцій з іменами:
add – додавання, sub – віднімання, mul – множення, div – ділення.
Кожен метод має приймати два цілих аргументи та виводити на екран результат виконання арифметичної операції відповідної імені методу.
Метод поділу div має виконувати перевірку спроби поділу на нуль. Потрібно надати користувачеві можливість вводити з клавіатури
значення операндів і знак арифметичної операції для виконання обчислень.
*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть перше число:");
        int a = scan.nextInt();
        System.out.println("Введіть арифметичний знак:");
        String arth = scan.next();
        System.out.println("Введіть друге число:");
        int b = scan.nextInt();


        switch (arth) {
            case "+":
                 add(a, b);
                break;
            case "-":
                sub(a, b);
                break;
            case "*":
                mul(a, b);
                break;
            case "/":
                div(a, b);
                break;
            default:
                System.out.println("Спробуйте ввести арифметичну дію ще раз");
        }
    }

    static void add(int arg1, int arg2) {
        System.out.println("Результат додавання = " + (arg1 + arg2));
    }

    static void sub(int arg1, int arg2) {
        System.out.println("Результат віднімання = " + (arg1 - arg2));
    }

    static void mul(int arg1, int arg2) {
        System.out.println("Результат множення = " + (arg1 * arg2));
    }

    static void div(int arg1, int arg2){
        if (arg2 == 0){
            System.out.println("Ви ввели 0. На 0 ділити не можна. Спробуйте ввести інше значення дільника");
        } else System.out.println("Результат ділення = " + (double) arg1 / arg2);

    }
}
























