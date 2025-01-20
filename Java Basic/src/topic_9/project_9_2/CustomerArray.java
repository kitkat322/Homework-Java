package topic_9.project_9_2;

import java.util.Scanner;

public class CustomerArray {
    public static void main(String[] args) {

/*Завдання 2
Використовуючи IntelliJ IDEA, створіть клас CustomerArray. Створити масив розміру N-елементів,
заповнити його довільними цілими значеннями (розмір масиву задає користувач).
Вивести на екран:
* найбільше значення масиву,
* найменше значення масиву,
* загальну суму всіх елементів,
* середнє арифметичне всіх елементів,
* вивести всі непарні значення.
*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть довжину масиву");
        int arrayLength = scan.nextInt();

        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 1 + 1;
            //System.out.println(array[i]);
        }

        int max = 0, min = 0, sum = 0;

        System.out.println("------------------");

        for (int elementOfArray : array) {  // найбільше значення масиву
            if (elementOfArray > max) {
                max = elementOfArray;
            }
        }
        System.out.println("Найбільше значення масиву: " + max);
        System.out.println("------------------");

        min = max;
        for (int elementOfArray : array) { // найменше значення масиву
            if (elementOfArray < min) {
                min = elementOfArray;
            } else continue;
        }
            System.out.println("Найменше значення масиву: " + min);
            System.out.println("------------------");

            for (int i = 0; i < array.length; i++) {  // загальна сума всіх елементів
                sum += array[i];
            }
            System.out.println("Загальна сума всіх елементів масиву: " + sum);
            System.out.println("------------------");

            System.out.println("Середнє арифметичне всіх елементів: " + (double)sum / array.length);
            System.out.println("------------------");

            System.out.print("Непарні значення масиву: "); // Непарні значення масиву
            for (int elementOfArray1 : array) {
                if ((elementOfArray1 & 1) != 0) System.out.print(elementOfArray1 + ", ");
            }

    }

}
