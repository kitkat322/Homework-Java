package topic_7.topic_7_2;

import topic_5.topic_5_4.Animal;

import java.io.*;

//Необхідно здійснити десеріалізацію з файлу попереднього проекту (Animal) та вивести на екран вміст.

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal(5, true, (byte) 4);
        File file = new File("C:\\Users\\Ritun\\IdeaProjects\\Java Advanced\\src\\topic_7\\topic_7_2\\file.txt");

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){

            oos.writeObject(animal);

            Animal a = (Animal) ois.readObject();
            System.out.println(a);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
