package topic_5.project_5_4;

import java.util.Scanner;

public class Premium {
    public static void main(String[] args) {

        /*
        Завдання 4
Використовуючи IntelliJ IDEA, створіть клас Premium. Напишіть програму розрахунку нарахування премій працівникам.
Премії розраховуються згідно з вислугою років.
Якщо вислуга до 5 років, премія становить 10% від заробітної плати.
Якщо вислуга від 5 років (включно) до 10 років, то премія становить 15% від заробітної плати.
Якщо вислуга від 10 років (включно) до 15 років, премія становить 25% від заробітної плати.
Якщо вислуга від 15 років (включно) до 20 років, премія становить 35% від заробітної плати.
Якщо вислуга від 20 років (включно) до 25 років, премія становить 45% від заробітної плати.
Якщо вислуга від 25 років (включно) та більше, премія складає 50% від заробітної плати.
Результати розрахунку виведіть на екран.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть кількість років вислуги робітника");
        byte years = scan.nextByte();
        int salary = 1000, prem;

        if (years >= 0 && years <= 4) {
            prem = salary * 10 / 100;
            System.out.println("Сума премії становить: " + prem);
            salary += prem;
            System.out.println("Сума зарплатні з премією: " + salary);
        } else if (years >= 5 && years <= 9) {
            prem = salary * 15 / 100;
            System.out.println("Сума премії становить: " + prem);
            salary += prem;
            System.out.println("Сума зарплатні з премією: " + salary);
        } else if (years >= 10 && years <= 14) {
            prem = salary * 25 / 100;
            System.out.println("Сума премії становить: " + prem);
            salary += prem;
            System.out.println("Сума зарплатні з премією: " + salary);
        } else if (years >= 15 && years <= 19) {
            prem = salary * 35 / 100;
            System.out.println("Сума премії становить: " + prem);
            salary += prem;
            System.out.println("Сума зарплатні з премією: " + salary);
        } else if (years >= 20 && years <= 24) {
            prem = salary * 45 / 100;
            System.out.println("Сума премії становить: " + prem);
            salary += prem;
            System.out.println("Сума зарплатні з премією: " + salary);
        } else if (years >= 25) {
            prem = salary * 50 / 100;
            System.out.println("Сума премії становить: " + prem);
            salary += prem;
            System.out.println("Сума зарплатні з премією: " + salary);
        } else {
            System.out.println("Неправильно введена к-сть років, спробуйте ще раз");
        }
    }
}
