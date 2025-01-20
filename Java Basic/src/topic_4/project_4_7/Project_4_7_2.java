package topic_4.project_4_7;

import java.util.Scanner;

public class Project_4_7_2 {
    public static void main(String[] args) {

        /*Завдання 7
Дано номер місяця – ціле число в діапазоні 1–12 (1 – січень, 2 – лютий і так далі). Визначте кількість днів цього місяця
для невисокосного року.*/

        Scanner in = new Scanner(System.in);
        System.out.println("Введіть номер місяця");
        byte month = in.nextByte();

        byte days = 30;
        //byte month = 1;

        switch (month) {
            case 1:
                System.out.println(++days);
                break;
            case 2:
                System.out.println(days - 2);
                break;
            case 3:
                System.out.println(++days);
                break;
            case 4:
                System.out.println(days);
                break;
            case 5:
                System.out.println(++days);
                break;
            case 6:
                System.out.println(days);
                break;
            case 7:
            case 8:
                System.out.println(++days);
                break;
            case 9:
                System.out.println(days);
                break;
            case 10:
                System.out.println(++days);
                break;
            case 11:
                System.out.println(days);
                break;
            case 12:
                System.out.println(++days);
                break;
            default:
                System.out.println("Введіть число від 1 до 12");
                break;

        }
    }
}
