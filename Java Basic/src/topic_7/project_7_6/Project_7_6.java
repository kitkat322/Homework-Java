package topic_7.project_7_6;

public class Project_7_6 {
    public static void main(String[] args) {

        /*Завдання 6
Опишіть метод powerA234(a), який обчислює другий, третій та четвертий степінь числа A та виводить ці степені
в консоль (усі параметри є дійсними). За допомогою цієї процедури знайдіть другий, третій та четвертий степені
п'яти зазначених чисел.
*/
        int a = 2, b = 3, c = 4, d = 6, e = 7;
        System.out.print("Другий, третій та четвертий степені числа " + a + ": ");
        powerA234(a);
        System.out.println();
        System.out.print("Другий, третій та четвертий степені числа " + b + ": ");
        powerA234(b);
        System.out.println();
        System.out.print("Другий, третій та четвертий степені числа " + c + ": ");
        powerA234(c);
        System.out.println();
        System.out.print("Другий, третій та четвертий степені числа " + d + ": ");
        powerA234(d);
        System.out.println();
        System.out.print("Другий, третій та четвертий степені числа " + e + ": ");
        powerA234(e);

    }

    static void powerA234(int arg1) {
        int pow = 1;
        for (int i = 0; i<5; i++){
            pow *= arg1;
            if (i>=1) System.out.print(pow + " ");
        }
    }
}
