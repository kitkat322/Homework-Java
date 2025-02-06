package topic_9.topic_9_2;

//Створіть проект за допомогою IntelliJ IDEA. Створіть клас MyList. Реалізуйте у найпростішому наближенні можливість використання його
// екземпляра аналогічно екземпляру класу List. Мінімально необхідний інтерфейс взаємодії з екземпляром повинен включати
// метод додавання елемента, індексатор для отримання значення елемента за вказаним індексом і властивість тільки для читання
// для отримання загальної кількості елементів.

public class MyList1<T> {

    T element1;
    T element2;
    T element3;
    T element4;
    T element5;
    T[] list;


    //конструктори
    public MyList1(T element1, T element2, T element3, T element4, T element5){
        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
        this.element4 = element4;
        this.element5 = element5;
        //this.list = createNewList();
    }
    public MyList1(T element1, T element2, T element3, T element4){
        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
        this.element4 = element4;
    }
    public MyList1(T element1, T element2, T element3){
        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
    }
    public MyList1(T element1, T element2){
        this.element1 = element1;
        this.element2 = element2;
    }

//    public E[] createNewList(){
//        //E[] list = new E[5];
//       // return list;
//    }

}
