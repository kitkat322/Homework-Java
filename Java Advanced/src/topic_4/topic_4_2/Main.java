package topic_4.topic_4_2;
//Напишіть жартівливу програму «Дешифратор», яка в текстовому файлі могла б замінити всі прийменники слово «Java»

import java.io.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        File file1 = new File("file1.txt"); // файл, де буде зберігатися початковий варіант тексту
        File file2 = new File("file2.txt"); // файл, де буде зберігатися змінений варіант тексту

            // запис тексту у файл
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file1))) {
                writer.write("This class is the superclass of all classes that filter output streams. " +
                        "These streams sit on top of an already existing output stream (the underlying output stream) " +
                        "which it uses as its basic sink of data, but possibly transforming the data along the way or " +
                        "providing additional functionality.\n" +
                        "The class FilterOutputStream itself simply overrides all methods of OutputStream with versions " +
                        "that pass all requests to the underlying output stream. Subclasses of FilterOutputStream may further " +
                        "override some of these methods as well as provide additional methods and fields.");
                System.out.println("Текст записано у " + file1.getName());
            } catch (IOException e) {
                System.out.println("Помилка запису у файл : " + e.getMessage());
            }

        // запис регулярного виразу
        String regex = "\\b(of|on|as|but|or|with|to|and)\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        // построкова перевірка на наявність регулярного запису та перезаписування тексту у новий файл
            try (BufferedReader reader = new BufferedReader(new FileReader(file1));
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file2))) {

                String line;
                while ((line = reader.readLine()) != null) {
                    String replacedLine = pattern.matcher(line).replaceAll("Java"); // зберігання рядка із заміненими словами
                    writer.write(replacedLine); // записування нового рядка у файл
                    writer.newLine();
                }
                System.out.println("Текст записано у " + file2.getName());
            } catch (IOException e) {
                System.out.println("Помилка читання файлу : " + e.getMessage());
                }

        // читання нового файлу
        try (BufferedReader reader = new BufferedReader(new FileReader("file2.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Перезаписаний варіант тексту:");
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
