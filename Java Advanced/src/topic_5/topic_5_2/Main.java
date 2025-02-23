package topic_5.topic_5_2;
//Напишіть програму, яка виводитиме всю інформацію про клас, користувач сам вибирає, який саме клас цікавить

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        scanNameOfClass();
    }

    //отримання імені класу від користувача
    public static void scanNameOfClass(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть назву повну класу, а також ім'я пакету"); //java.util.ArrayList
        //метод forName потребує повного імені класу, що містить назву пакета, якому він належить
        String className = scan.nextLine();
        classInfo(className);
    }

    // отримання об'єкту типу Class
    public static void classInfo(String className){

        try {
            Class<?> clazz = Class.forName(className);
            showClassInfo(clazz);
        } catch (ClassNotFoundException e) {
            System.out.println("Клас не знайдено: " + e.getMessage());
            scanNameOfClass();
        }
    }

    //
    public static void showClassInfo(Class<?> usersClass){

        // отримання інформації про суперклас
        Class<?> superClazz = usersClass.getSuperclass();
        System.out.println("Extends: " + superClazz.getName() + "\n");

        // отримання інформації про поля
        Field[] fields = usersClass.getDeclaredFields();
        System.out.println("Fileds of " + usersClass.getName() + ":");
        for (Field field : fields){
            Class<?> fieldType = field.getType();
            System.out.println("\tName: " + field.getName());
            System.out.println("\tType: " + fieldType.getName() + "\n");
        }

        // отримання інформації про конструктори
        System.out.println("Constructors of " + usersClass);
        Constructor<?>[] constructors = usersClass.getConstructors();
        byte i = 1;
        for (Constructor<?> constructor : constructors){
            System.out.print("\tConstructor " + i++ + ": ");

            // отримання та вивід параметрів конструкторів
            Class<?>[] paramTypes = constructor.getParameterTypes();
            for (Class<?> paramType : paramTypes){
                System.out.print(paramType.getName() + " ");
            }
            System.out.println();
        }

        // отримання інформації про методи
        System.out.println("\nMethods of " + usersClass);
        Method[] methods = usersClass.getDeclaredMethods();
        for(Method method : methods){
            System.out.println("Name: " + method.getName());
            System.out.println("\tReturn type: " + method.getReturnType().getName());

            Class<?>[] paramTypes = method.getParameterTypes();
            System.out.print("\tParam types: ");
            for (Class<?> paramType : paramTypes){
                System.out.print(" " + paramType.getName());
            }
            System.out.println();
        }

        // отримання інформації про модифікатори класу
        System.out.print("\nModifiers of " + usersClass + ": ");
        int mod = usersClass.getModifiers();

        if (Modifier.isPrivate(mod)) {
            System.out.print("private ");
        }
        if (Modifier.isProtected(mod)) {
            System.out.print("protected ");
        }
        if (Modifier.isPublic(mod)) {
            System.out.print("public ");
        }
        if (Modifier.isFinal(mod)) {
            System.out.print("final ");
        }
        if (Modifier.isStatic(mod)) {
            System.out.print("static ");
        }
    }
}
