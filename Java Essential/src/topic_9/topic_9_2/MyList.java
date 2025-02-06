package topic_9.topic_9_2;

//Створіть проект за допомогою IntelliJ IDEA. Створіть клас MyList. Реалізуйте у найпростішому наближенні можливість використання його
// екземпляра аналогічно екземпляру класу List. Мінімально необхідний інтерфейс взаємодії з екземпляром повинен включати
// метод додавання елемента, індексатор для отримання значення елемента за вказаним індексом і властивість тільки для читання
// для отримання загальної кількості елементів.

import java.util.Arrays;

public class MyList {

    private int index = 0;
    int amount = 0;
    public int[] integers = new int[amount];

    public void add(int value){
        integers = Arrays.copyOf(integers, ++amount);
        integers[index++] = value;
    }

    public int get(int index){
        return integers[index];
    }

    public int size(){
        return index;
    }
}
