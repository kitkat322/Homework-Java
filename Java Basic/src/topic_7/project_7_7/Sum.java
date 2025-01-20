package topic_7.project_7_7;

public class Sum {
    public static void main(String[] args) {

        int a = 12;

        sumOfNumbers(a);
    }

    static void sumOfNumbers (int arg1){ // метод, який приймає число та повертає суму цифр цього числа
        int num = 0;
        while (arg1>0){
            num += arg1%10;
            arg1 /=10;
            System.out.println(num);
        }
    }
}
