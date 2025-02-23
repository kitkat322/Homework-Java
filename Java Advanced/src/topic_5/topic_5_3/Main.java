package topic_5.topic_5_3;

// Створіть клас, в ньому визначте 3 поля, до цих полів створіть конструктори та методи.
// Використовуючи рефлексію отримайте всю інформацію про поля, методи, конструктори, а також модифікатори доступу.

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException {

        Class<?> clazz = Hamster.class;

        // отримання інформації про поля
        Field[] fields = clazz.getDeclaredFields();
        System.out.println("Fileds of " + clazz.getName() + ":");
        for (Field field : fields){
            Class<?> fieldType = field.getType();
            System.out.println("\tName: " + field.getName());
            System.out.println("\tType: " + fieldType.getName() + "\n");
        }

        // отримання інформації про конструктори
        Constructor<?>[] constructors = clazz.getConstructors();
        System.out.println("Constructors of " + clazz.getName() + ":");
        for(Constructor<?> constructor : constructors){
            System.out.println(constructor);
        }

        // отримання інформації про методи
        Method[] methods = clazz.getDeclaredMethods();
        System.out.println("\nMethods of " + clazz.getName() + ":");
        for(Method method : methods){
            System.out.println("Name: " + method.getName());
            System.out.println("\tReturn Types: " + method.getReturnType());

            Class<?>[] paramTypes = method.getParameterTypes();
            System.out.print("\tParam Types: ");
            for(Class<?> paramType : paramTypes){
                System.out.print(paramType.getName() + " ");
            }
            System.out.println();
        }

        // отримання інформації про модифікатори доступу
        System.out.print("\nModifiers of " + clazz + ": ");
        int mod = clazz.getModifiers();

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
