package topic_8.project_8_4;

public class Project_8_4 {
    public static void main(String[] args) {

        /*Завдання 4
Створіть три перевантажені методи для пошуку середнього арифметичного числа з 3, 4, 5 змінних,
створіть метод для пошуку мінімального, максимального та середнього значень серед цих трьох методів.
*/

        int a = 3, b = 5, c = 6, d = 8, e = 9;
        double avarage3 = avarage(a, b, c);
        double avarage4 = avarage(a, b, c, d);
        double avarage5 = avarage(a, b, c, d, e);
        System.out.println(minNumber(avarage3, avarage4, avarage5));
        System.out.println(medNumber(avarage3, avarage4, avarage5));
        System.out.println(maxNumber(avarage3, avarage4, avarage5));

    }

    static double avarage(int arg1, int arg2, int arg3) {
        double avarage = 0;
        avarage += arg1;
        avarage += arg2;
        avarage += arg3;
        return avarage / 3;
    }

    static double avarage(int arg1, int arg2, int arg3, int arg4) {
        double avarage = 0;
        avarage += arg1;
        avarage += arg2;
        avarage += arg3;
        avarage += arg4;
        return avarage / 4;
    }

    static double avarage(int arg1, int arg2, int arg3, int arg4, int arg5) {
        double avarage = 0;
        avarage += arg1;
        avarage += arg2;
        avarage += arg3;
        avarage += arg4;
        avarage += arg5;
        return avarage / 5;
    }

    static double minNumber(double arg1, double arg2, double arg3) {
        /*if (arg1 < arg2 && arg1 < arg3) {
            return arg1;
        } else if (arg2 < arg1 && arg2 < arg3) {
            return arg2;
        } else return arg3;*/

        double min = (arg1 < arg2 && arg1 < arg3) ? arg1 : (arg2 < arg1 && arg2 < arg3) ? arg2 : arg3;
        return min;

    }

    static double maxNumber(double arg1, double arg2, double arg3) {
        /*if (arg1 > arg2 && arg1 > arg3) {
            return arg1;
        } else if (arg2 > arg1 && arg2 > arg3) {
            return arg2;
        } else return arg3;*/
        double max = (arg1 > arg2 && arg1 > arg3) ? arg1 : (arg2 > arg1 && arg2 > arg3) ? arg2 : arg3;
        return max;
    }

    static double medNumber(double arg1, double arg2, double arg3) {
        double min = minNumber(arg1, arg2, arg3);
        double max = maxNumber(arg1, arg2, arg3);

        if (arg1 > min && arg1 < max) {
            return arg1;
        } else if (arg2 > min && arg2 < max) {
            return arg2;
        } else return arg3;
    }
}












