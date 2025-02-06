package topic_8.topic_8_2;

//    Створити класи:
//1) Основний клас Device (manufacturer(String), price(float), serialNumber(String));
//2) Сабклас Monitor (resolutionX(int), resolutionY(int)) і EthernetAdapter (speed(int), mac(String)); Додати методи доступу. Конструктор.
//    Дивитися завдання 2. В обох класах перевизначити метод toString, щоб виведення було наступним:
//Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
//Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280, Y=1024
//Подивитися завдання 2. Перевизначити методи equals & hashCode у кожному класі.
// Створити клас Main, де створити об'єкти класів і продемонструвати перевизначені методи.

public class Monitor extends Device {

    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY){
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString(){
        return String.format("manufacturer = %s, price = %s, serialNumber = %s, X = %d, Y = %d", super.getManufacturer(), super.getPrice(), super.getSerialNumber(), resolutionX, resolutionY);
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 18 * result + (super.getManufacturer() == null ? 0 : getManufacturer().hashCode());
        result = 18 * result + (getSerialNumber() == null ? 0 : getSerialNumber().hashCode());
        result = 18 * result + Float.floatToIntBits(getPrice());
        result = 18 * result + resolutionX;
        result = 18 * result + resolutionY;

        return result;
    }

    // геттери та сеттери

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }
}
