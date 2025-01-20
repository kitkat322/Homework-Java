package topic_5.project_5_3.project_5_3_2;

public class LogicOperations {
    public static void main(String[] args) {

        /* Завдання 3
Використовуючи IntelliJ IDEA, створіть клас LogicOperations. Є 3 змінні типу int x = 5, y = 10, і z = 15.
Виконайте та розрахуйте результат таких операцій для цих змінних:
§  x += y >> x++ * z;
§  z = ++x & y * 5;
§  y /= x + 5 | z;
§  z = x++ & y * 5;
§  x = y << x++ ^ z;*/

        int x = 5;   // 5, 7,
        int y = 10;  // 0,
        int z = 15;  // 2, 0

        x += y >> x++ * z;    // 10 / 2 ^ (5 * 15) = 10 / 2^75 = 10 / 3.7e+22 = 2,7^-37 = 0; x = 5 + 0 = 5
                              // x = 5

        z = ++x & y * 5;      // (5 +1 +1) & 10 * 5 = 7 & 50 = 2
                              // z = 2

                              // 0000 0111  - 7
                              // 0011 0010  - 50
                              // 0000 0010  - 2

        y /= x + 5 | z;       // 7 + 5 | 2 = 7 + 7 = 14;  10 / 14 = 0
                              // y = 0

                              // 0000 0101  - 5
                              // 0000 0010  - 2
                              // 0000 0111  - 7

        z = x++ & y * 5;      // 7 & 0 * 5 = 7 & 0 = 0

        x = y << x++ ^ z;     // (0 * 2^ 7) ^ 0 = 0
                              // x = 0

                              // 0000 1000  - 8
                              // 0000 0000  - 0
                              // 0000 1000  - 8

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


    }
}
