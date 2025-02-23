package topic_5.topic_5_3;
// Створіть клас, в ньому визначте 3 поля, до цих полів створіть конструктори та методи.
// Використовуючи рефлексію отримайте всю інформацію про поля, методи, конструктори, а також модифікатори доступу.

public final class Hamster {
    public String name;
    private int age;
    private String color;

    public Hamster(){}
    public Hamster(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

    public String getColor() {return color;}

    public void setColor(String color) {this.color = color;}
}
