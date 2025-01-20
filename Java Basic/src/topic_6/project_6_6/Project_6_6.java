package topic_6.project_6_6;

public class Project_6_6 {
    public static void main(String[] args) {

        /*Завдання 6
Дано ціле число N (> 0). Використовуючи один цикл, знайдіть суму 1 + 1/(1!) + 1/(2!) + 1/(3!) +. . . + 1/(N!) */

        int n = 1, factorial = 1;
        double sum = 1;
        int a = 4;

        for (int i = 0; i<a; ++i){ // i<=a; ++i     i<a; i++

            factorial *= n++;
            sum += (double) 1 / factorial;

            //System.out.println(sum);
        }
        System.out.println(sum);

        //i<=n; ++i
        // 1 + 1/1 + 1/2 + 1/6 + 1/24 + 1/120 = 1 + 1 + 0,5 + 0,1666666 + 0,0416666 + 0,008333333


    }
}




