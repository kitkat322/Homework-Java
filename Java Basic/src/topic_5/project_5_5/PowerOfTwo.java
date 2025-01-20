package topic_5.project_5_5;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {

/*Завдання 5
Відомо, що в числах, які є ступенем двійки, лише один біт має значення 1. Використовуючи IntelliJ IDEA, створіть клас PowerOfTwo.
Напишіть програму, яка перевірятиме, чи є вказане число ступенем двійки, чи ні.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть число");
        int a = scan.nextInt();
        boolean b = (a & --a) == 0;

        if (b) {
            System.out.println(++a + " є степінню числа 2");
        } else System.out.println(++a + " не є степінню числа 2");
    }
}

/*
0100 0000 0101    1026


0100 0000 0001    1025

0100 0000 0000    1024
0011 1111 1111    1023
00000000000000

0011 1111 1111    1023
0011 1111 1110    1022
0011 1111 1110

0000 0100
0000 0011
0000 0000

1000
0111
0000



* */