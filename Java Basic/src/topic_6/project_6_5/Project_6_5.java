package topic_6.project_6_5;

public class Project_6_5 {
    public static void main(String[] args) {

        /*Завдання 5
Дано два цілих числа A і B (A < B). Знайдіть суму всіх цілих чисел від A до B включно. */

        int a = 3, b = 7, sum = 0;

        do{
            sum += a++;
        }
        while (a<=b);

        System.out.println(sum);






        /*do{
            sum += ++a;  // a = 3 4 5
            System.out.println(sum);
        }
        while (a<b);

        System.out.println(sum); // 12*/

    }
}
