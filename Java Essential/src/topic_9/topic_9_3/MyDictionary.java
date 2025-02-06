package topic_9.topic_9_3;

//Створіть проект за допомогою IntelliJ IDEA. Створіть клас MyDictionary. Реалізуйте у найпростішому наближенні можливість використання
// його екземпляра. Мінімально необхідний інтерфейс взаємодії з екземпляром повинен включати метод додавання пар елементів,
// індексатор для отримання значення елемента за вказаним індексом і властивість тільки для читання для отримання загальної
// кількості пар елементів.

import java.util.ArrayList;

public class MyDictionary {

    private String wordPair;
    ArrayList<String> dictionary = new ArrayList<>();

//    public MyDictionary(String wordPair){
//        this.wordPair = wordPair;
//    }

    public void addWord(String wordPair){
        dictionary.add(wordPair);
    }

    public String getWord(int index){
        return dictionary.get(index);
    }

    public int dictionarySize(){
        return dictionary.size();
    }

    public void show(){
        for(int i = 0; i<dictionarySize(); i++){
            System.out.println(getWord(i));
        }
    }
}
