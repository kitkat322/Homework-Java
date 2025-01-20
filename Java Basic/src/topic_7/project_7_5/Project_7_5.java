package topic_7.project_7_5;

public class Project_7_5 {
    public static void main(String[] args) {

        /*Завдання 5

Опишіть метод powerA3(a), який обчислює третю степінь числа та повертає це значення.
За допомогою цієї процедури знайдіть третій степінь п'яти зазначених чисел.
*/
        int a = 2, b = 3, c = 4, d = 5, e = 128;
        System.out.println(powerA3(a));
        System.out.println(powerA3(b));
        System.out.println(powerA3(c));
        System.out.println(powerA3(d));
        System.out.println(powerA3(e));
    }

    /*static int powerA3 (int arg1) {
        return arg1*arg1*arg1;
    }
*/
    static int powerA3 (int arg1) {
        int pow3 = 1;
        for (int i = 0; i<3; i++){
            pow3 *= arg1;
        }
        return pow3;
    }

}
