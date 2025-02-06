package topic_9.topic_9_3;

//Створіть проект за допомогою IntelliJ IDEA. Створіть клас MyDictionary. Реалізуйте у найпростішому наближенні можливість використання
// його екземпляра. Мінімально необхідний інтерфейс взаємодії з екземпляром повинен включати метод додавання пар елементів,
// індексатор для отримання значення елемента за вказаним індексом і властивість тільки для читання для отримання загальної
// кількості пар елементів.

public class Main {
    public static void main(String[] args) {
        MyDictionary d1 = new MyDictionary();
        d1.addWord("one - один");
        d1.addWord("two - два");
        d1.addWord("three - три");
        d1.addWord("four - чотири");

//        System.out.println("Перша пара слів:    " + d1.getWord(0));
//        System.out.println("Друга пара слів:    " + d1.getWord(1));
//        System.out.println("Третя пара слів:    " + d1.getWord(2));
        System.out.println("Четверта пара слів: " + d1.getWord(3));

        System.out.println("Кількість слів у словнику: " + d1.dictionarySize());
        //d1.show();
    }
}
