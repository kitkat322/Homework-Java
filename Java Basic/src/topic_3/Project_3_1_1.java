package Topic_3.project_1.Topic_3_1;

public class Project_3_1_1 {
    public static void main (String[] args) {

        /*Завдання 1
Є 3 змінні типу int x = 10, y = 12 та z = 3. Виконайте розрахунок результату таких операцій для цих змінних:
§  x += y – x++ * z;
§  z = --x – y * 5;
§  y /= x + 5 % z;
§  z = x++ + y * 5;
§  x = y – x++ * z;
*/

        int x = 10; // -8, -9, -8, -7, -195;
        int y = 12; // -3,
        int z = 3;  // -69, -24;

        //x += y - x++ * z;  // x = 10 + (12 - 10 * 3) = 10 + (12 - 30) = 10 - 18 = -8;  x = -8;
        //z = --x - y * 5;   // z = -8 + (- 1) - 12 * 5 = -69;                           z = -69;
        //y /= x + 5 % z;    // y = 12 / (-9 + 5 % -69) = 12 / (-9 + 5) = 12 / -4 = -3;  y = -3;
        //z = x++ + y * 5;   // z = -9 + (-3) * 5 = -9 - 15 = -24; z = -24;              z = -24;
        x = y - x++ * z;   // x = -3 - (-8) * (-24) = -3 - 192 = -195;                 x = -195;


        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
