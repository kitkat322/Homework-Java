package topic_8.topic_8_5;

//Використовуючи Intelij IDEA, створити проект, пакет. Створити клас Animal з ім'ям String, int віком, хвостом Boolean.
// У класі перевизначити метод toString, щоб висновок був наступним «Ім'я: Васька, вік: 45, хвіст: ні».
// У класі Animal перевизначити методи equals & hashCode.

import topic_8.topic_8_2.Device;

public class Animal {

    private String name;
    private int age;
    private boolean tail;

     public Animal(String name, int age, boolean tail){
         this.name = name;
         this.age = age;
         this.tail = tail;
     }

     @Override
     public String toString(){
         String ansTail;
         if (tail) {
             ansTail = "так";
         } else ansTail = "ні";
         return String.format("Ім'я: %s, вік: %d, хвіст: %s", name, age, ansTail);
     }

     @Override
     public boolean equals(Object object){
         if (this == object) return true;
         if (object == null || this.getClass() != object.getClass()) return false;
         Animal animal = (Animal) object;
         if (this.name != animal.name) return false;
         if (this.age != animal.age) return false;
         if (this.tail != animal.tail) return false;
         return true;
     }

     public int hashCode() {
         int result = 22;

         result = 18 * result + (name == null ? 0 : name.hashCode());
         result = 18 * result + (tail == true ? 100 : 222);
         result = 18 * result + age;

         return result;
     }
}
