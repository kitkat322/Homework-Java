package topic_1.topic_1_3;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {

//        Завдання 3
//        Використовуючи IDEA, створіть проект із пакетом. Потрібно: Створити клас Book (Main). Створити класи Title, Author та Content,
//        кожен з яких повинен містити одне рядкове поле та метод void show(). Реалізуйте можливість додавання до книги назви книги,
//        імені автора та змісту. Виведіть на екран за допомогою методу show() назву книги, ім'я автора та Зміст.


        Title title = new Title();
        Author author = new Author();
        Content content = new Content();
        Scanner scan = new Scanner(System.in);

        System.out.print("Введіть назву книги: ");
        String title1 = scan.nextLine();
        title.setTitle(title1);

        System.out.print("Введіть автора книги: ");
        String author1 = scan.nextLine();
        author.setAuthor(author1);

        System.out.print("Введіть зміст книги: ");
        String content1 = scan.nextLine();
        content.setContent(content1);


        title.show();
        author.show();
        content.show();

    }
}
