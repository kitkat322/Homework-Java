package topic_6.project_6_2;

public class Test {
    public static void main(String[] args) {

        /*Завдання 2
Використовуючи IntelliJ IDEA, створіть клас SumMin. Дано два числа A та B (A<B).
Виведіть суму всіх чисел, які розташовані між цими числами на екран. Дано два числа A та B (A<B).
Виведіть усі непарні значення, які розташовані між цими числами.*/

        int a = 2, b = 5, sum = 0;

        for (int i = 0; a<b; ++a){
            sum += a;
            //System.out.println(a);
            //System.out.println(sum+ "\n");
        }
        System.out.println(sum);


    }
}
