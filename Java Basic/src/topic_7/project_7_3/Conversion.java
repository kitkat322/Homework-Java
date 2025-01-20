package topic_7.project_7_3;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {

        /*Завдання 3
Використовуючи IntelliJ IDEA, створіть клас Conversion. Напишіть програму, яка конвертуватиме валюти. Користувач вводить:
1)      суму грошей у певній валюті;
2)      курс конвертації в іншу валюту.
Організуйте виведення результату операції конвертування валюти на екран. */

        Scanner scan = new Scanner(System.in);

        System.out.println("Введіть суму грошей:");
        int money = scan.nextInt();
        System.out.println("Введіть курс:");
        double rate = scan.nextDouble();

        System.out.println(conversion(money, rate));
    }

    static double conversion (int a, double b){
        return a*b;
    }

}
