package topic_9.topic_9_5;

public class MyClass <T>{
    public <T> MyClass<T> factoryMethod(){
        MyClass<T> a = new MyClass();
        return a;
    }
}
