package topic_5.topic_5_4;

// Створіть 2 класи, Animal та Cat. У класі Animal ініціалізуйте 3 поля різних модифікаторів.
// У класі Cat використовуючи рефлексію, отримайте доступ до полів класу Animal та змініть вміст кожного з полів.

import java.lang.reflect.Field;

public class Cat {
    public static void main(String[] args) {

        try{
            Class<?> clazz = Animal.class;
            Animal animal = new Animal();

            //зміна поля age
            Field field = clazz.getDeclaredField("age");
            field.setAccessible(true);
            System.out.println("Private int age  : " + field.getInt(animal));
            field.setInt(animal, 10);
            System.out.println("New value of age : " + field.getInt(animal));

            //зміна поля tail
            field = clazz.getDeclaredField("tail");
            field.setAccessible(true);
            System.out.println("Private boolean tail : " + field.getBoolean(animal));
            field.setBoolean(animal, true);
            System.out.println("New value of tail    : " + field.getBoolean(animal));

            //зміна поля feet
            field = clazz.getDeclaredField("feet");
            field.setAccessible(true);
            System.out.println("Private byte feet : " + field.getByte(animal));
            field.setByte(animal, (byte)6);
            System.out.println("New value of feet : " + field.getByte(animal));

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
