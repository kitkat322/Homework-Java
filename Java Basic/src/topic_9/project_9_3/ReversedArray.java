package topic_9.project_9_3;

public class ReversedArray {
    public static void main(String[] args) {

        /*Завдання 3
Використовуючи IntelliJ IDEA, створіть клас ReversedArray. Створити метод myReverse(int [] array), який приймає як аргумент масив
цілочислових елементів і повертає інвертований масив (елементи масиву у зворотному порядку).
Створити метод int [] subArray (int [] array, int index, int count). Метод повертає частину отриманого як аргумент масиву,
починаючи з позиції, яка зазначена в аргументі index, розмірністю, що відповідає значенню аргументу count.
Якщо аргумент count містить значення більше, ніж кількість елементів, що входять до частини вихідного масиву
(від зазначеного індексу index до індексу останнього елемента), то під час формування нового масиву розмірністю в count,
заповніть одиницями ті елементи, які не були скопійовані з вихідного масиву.
*/

        int[] myArray = {2, 3, 4, 5, 6};
        for (int a = 0; a < 1; a++) {
            for (int name : myArray) {
                System.out.print(name + " ");
            }
            System.out.println();
        }
        int l = myArray.length;
        myArray = myReverse(myArray);

        for (int name : myArray) {
            System.out.print(name + " ");
        }


        //
        // 0 (1) 4 (5)
        // 1 (2) 3 (4)
        // 2 (3) 2 (3)
        // 3 (4) 1 (2)
        // 4 (5) 0 (1)

        //int[] arrayReverse =
        //myReverse(myArray);
        //System.out.println(arrayReverse);


    }

    /*static int[] myReverse(int[] array) {
        int l = array.length;
        for (int i : array) {
            --l;
            i = array[l];
            //System.out.print(i + " ");
        }
        return array;
    }*/



    static int[] myReverse(int [] array) {
        int array1[] = new int [array.length];
        for (int i = 0; i < array.length; i++){
            array1[i] = array[i];
        }
        int l = array.length;
        for (int i = 0; i < array.length; i++) {
            --l;
            array1[i] = array[l];
            //System.out.print(myArray[i] + " ");
        }
        return array1;
    }

    /*static void myReverse(int[] array) {
        for (int i = 0; i < array.length; i++){
            int lenth = array.length;
            array[i] = array[lenth--];
            System.out.println(array[i]);
        }
            //return array;
    }*/

}

















