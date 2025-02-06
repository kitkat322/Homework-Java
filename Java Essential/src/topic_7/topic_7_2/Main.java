package topic_7.topic_7_2;

import java.util.Arrays;
import java.util.Scanner;
//    Створіть проект за допомогою IntelliJ IDEA. Потрібно: Описати клас з ім'ям Worker, що містить такі поля:
//  прізвище та ініціали працівника;
//  назва посади;
//  рік надходження на роботу.
//Написати програму, яка виконує такі дії:
//  введення з клавіатури даних до масиву, що складається з п'яти елементів типу Worker (записи мають бути впорядковані за абеткою);
//  якщо значення року введено не у відповідному форматі, видає виняток.
//  виведення на екран прізвища працівника, стаж роботи якого перевищує введене значення.

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Worker[] workers = new Worker[2];


        for (int i = 0; i < workers.length; i++) {
            Worker worker = new Worker();
            System.out.println("Введіть ім'я працівника:");
            String name = scan.nextLine();
            worker.setName(name);

            System.out.println("Введіть назву посади:");
            String position = scan.nextLine();
            worker.setPosition(position);

            System.out.println("Введіть рік початку роботи:");
            int YearOfEmployment = scan.nextInt();
            scan.nextLine();
            try {
                worker.setYearOfEmployment(YearOfEmployment);
            } catch (InvalidYearOfEmploymentException e) {
                System.out.println(e.getMessage());
                System.out.println("Ім'я працівника, стаж роботи якого перевищує можливе значення: " + name);
            }
            workers[i] = worker;
        }

        //Arrays.sort(workers);

//        for (Worker temp : workers){
//            System.out.println(Arrays.deepToString(workers));
//        }

        System.out.println(Arrays.deepToString(workers));

    }
}
