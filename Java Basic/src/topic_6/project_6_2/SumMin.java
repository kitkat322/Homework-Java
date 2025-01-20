package topic_6.project_6_2;

import java.util.Scanner;

public class SumMin {
    public static void main(String[] args) {


        /*Завдання 2
Використовуючи IntelliJ IDEA, створіть клас SumMin. Дано два числа A та B (A<B).
Виведіть суму всіх чисел, які розташовані між цими числами на екран. Дано два числа A та B (A<B).
Виведіть усі непарні значення, які розташовані між цими числами.*/

        // int a = 12, b = 16, sum = 0, g = a;
        Scanner scan = new Scanner(System.in);

        System.out.println("Введіть перше число");
        int a = scan.nextInt();

        System.out.println("Введіть друге число");
        int b = scan.nextInt();

        int a1 = a;
        int sum = 0;

        if (a < b) {
            while (++a < b) {
                sum += a;
                if ((a & 1) == 1) System.out.println("Непране число: " + a);
            }
            System.out.print("Сума чисел, розташованих між числами " + a1 + " і " + b + " = " + sum);

        } else System.out.println("Друге число має бути меншим за перше. Спробуйте ще раз");
    }
}




// 0000 1011
// 0000 0001