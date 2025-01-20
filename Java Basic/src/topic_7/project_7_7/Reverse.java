package topic_7.project_7_7;

public class Reverse {
    public static void main(String[] args) {

        /*Дано число 54321. Треба вивести в консоль реверс цього числа - 12345*/

        int a = 54321;
        reverse(a);
    }

    static void reverse(int arg1){
        int reverse = 0;
        while (arg1>0){
            reverse = reverse * 10 + arg1 %10;
            arg1 /=10;
            System.out.println(reverse);

        }

    }
}
