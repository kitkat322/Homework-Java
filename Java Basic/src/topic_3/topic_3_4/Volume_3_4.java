package Topic_3.project_1.Topic_3_1.Topic_3_4;

import java.util.Scanner;

public class Volume_3_4 {
    public static void main(String[] args) {

        /*
        Завдання 4
Використовуючи IntelliJ IDEA, створіть клас Volume. Напишіть програму розрахунку об'єму – V та
площі поверхні - S циліндра. Об'єм V циліндра радіусом – R та висотою – h, обчислюється за формулою:
V = πR2h. Площа поверхні циліндра обчислюється за формулою: S = 2πR2 + 2πR2 = 2πR(R+h). Результати
розрахунків виведіть на екран.
*/

        // Правильна формула площі циліндра: S = 2πR2 + 2πRh = 2πR(R+h)

        Scanner scan = new Scanner(System.in);

        System.out.print("Введіть радіус циліндра: ");
        int r = scan.nextInt();

        System.out.print("А тепер введіть висоту циліндра: ");
        int h = scan.nextInt();

        double r2 = Math.pow(r, 2);
        final float PI = 3.1415f;

        double v = PI * r2 * h;
        double s = 2 * PI * r2 + 2 * PI * r * h;  // 2 * 3.1415 * 25 + 2 * 3.1415 * 4 = 157.075 + 25.132 =
        double s1 = 2 * PI * r * (r+h);           // 2 * 3.1415 * 5 * (5+4) = 282,735; 2 * 3.1415 * 5 * 5 + 2 * 3.1415 * 5 * 4

        System.out.println("Об'єм цилінтдра дорівнює: " + v);
        System.out.println("Площа цилінтдра дорівнює: " + s);
        System.out.println("Площа цилінтдра дорівнює: " + s1);

    }
}
