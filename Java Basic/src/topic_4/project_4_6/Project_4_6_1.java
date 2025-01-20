package topic_4.project_4_6;

public class Project_4_6_1 {
    public static void main(String[] args) {

        /*Завдання 6
Дано три цілих числа. Знайдіть максимальне, мінімальне та середнє. */

        int a = 1, b = 4, c = 9;

        int i = a > b ? a : b;
        int max = i > c ? i : c;
        System.out.println("max = " + max);

        int e = a < b ? a : b;
        int min = e < c ? e : c;
        System.out.println("min = " + min);

        int avg = (a < max & a > min) ? a : (b < max & b > min) ? b : (c < max & c > min) ? c : 0;
        System.out.println("avg = " + avg);

    }

}
