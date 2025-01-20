package topic_4.project_4_2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        /*Завдання 2
Використовуючи IntelliJ IDEA, створіть клас Calculator.
Напишіть програму «Консольний калькулятор».
Створіть дві змінні з іменами operand1 та operand2. Вкажіть змінним деякі довільні значення. Запропонуйте користувачу ввести
арифметичний знак. Прийміть значення, введене користувачем та помістіть його у рядкову змінну sign.

Для організації вибору алгоритму обчислювального процесу використовуйте перемикач switch. Виведіть на екран результат виконання
арифметичної операції.

У разі використання операції ділення, організуйте перевірку спроби ділення на нуль. І якщо така є, то скасуйте виконання арифметичної
операції та повідомте про помилку користувача. */

        //int operand1 = 16, operand2 = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше число");
        float operand1 = scanner.nextFloat();

        System.out.println("Введіть арифметичний знак");
        String sign = scanner.next();

        System.out.println("Введіть друге число");
        float operand2 = scanner.nextFloat();


        switch (sign) {
            case "+":
                System.out.println(operand1 + operand2);
                break;

            case "-":
                System.out.println(operand1 - operand2);
                break;

            case "*":
                System.out.println(operand1 * operand2);
                break;

            case "%":
                if (operand2 != 0) {
                    System.out.println(operand1 % operand2);
                }
                else {
                    System.out.println("На нуль ділити не можна, введіть інше значення дільника");
                }
                break;

            case "/":
                if (operand2 != 0) {
                    System.out.println(operand1 / operand2);
                }
                else {
                    System.out.println("На нуль ділити не можна, введіть інше значення дільника");
                }
                break;

            default:
                System.out.println("Спробуйте ввести арифметичний знак ще раз");


            }
        }
    }