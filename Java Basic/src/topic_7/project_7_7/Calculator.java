package topic_7.project_7_7;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        /*Завдання 7

Використовуючи IntelliJ IDEA, створіть клас Calculator. Створіть метод з ім'ям calculate,
який приймає як параметри три цілих аргументи та виводить на екран середнє арифметичне значень аргументів.
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть три числа");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println("Середнє арифметичне = " + calculate(a,b,c));

    }

    static double calculate(int arg1, int arg2, int arg3){
        double avarage = arg1 + arg2 + arg3;
        avarage /= 3;
        return avarage;
    }
}
