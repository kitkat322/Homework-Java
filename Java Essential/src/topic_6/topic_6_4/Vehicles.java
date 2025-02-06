package topic_6.topic_6_4;

public enum Vehicles {
//    Створіть проект за допомогою IntelliJ IDEA. Створіть перечислювальний тип (enum) Vehicles, що містить конструктор,
//    який повинен набувати цілого числа (вартість автомобіля), містити метод getColor(), який повертає рядок з кольором автомобіля,
//    і містити перевантажений метод toString(), який повинен повертати рядок з назвою екземпляра, кольором та вартістю автомобіля.

    MERCEDES(16000){
        @Override
        public String getColor() {return "чорний";}
    },

    AUDI(25000) {
        @Override
        public String getColor() {return "білий";}
    },

    BMW(35000){
        @Override
        public String getColor() {return "сірий";}
    };

    int price;

    Vehicles(int price){
        this.price = price;
    }

    public abstract String getColor();

    public String toString(){
        return "Автомобіль: " + super.toString() + ", ціна: " + price + ", колір: " + getColor();
    }


}
