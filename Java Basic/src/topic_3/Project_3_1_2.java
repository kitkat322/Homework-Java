package topic_3;

public class Project_3_1_2 {
    public static void main(String[] args) {

        /*Завдання 1
Є 3 змінні типу int x = 10, y = 12 та z = 3. Виконайте розрахунок результату таких операцій для цих змінних:
§  x += y – x++ * z;
§  z = --x – y * 5;
§  y /= x + 5 % z;
§  z = x++ + y * 5;
§  x = y – x++ * z;
*/

        int x = 10, y = 12, z = 3;

        /*
        x += y - x++ * z;           // x = 10 + (12 - 10 * 3) = 10 + (12 - 30) = 10 - 18 = -8,     x = -8;
        System.out.println(x);


        z = --x - y * 5;            // z = 10 - 1 - 12 * 5 = 9 - 60 = -51,                         z = -51;
        System.out.println(z);


        y /= x + 5 % z;             // y = 12 / (10 + 5 % 3) = 12 / (10 + 2) = 12 / 12 = 1,        y = 1;
        System.out.println(y);


        z = x++ + y * 5;            // z = 10 + 12 * 5 = 10 + 60 = 70,                             z = 70;
        System.out.println(z);


        x = y - x++ * z;            // x = 12 - 10 * 3 = 12 - 30 = -18,                            x = -18;
        System.out.println(x);
        */


    }
}
