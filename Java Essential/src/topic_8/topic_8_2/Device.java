package topic_8.topic_8_2;

//    Створити класи:
//1) Основний клас Device (manufacturer(String), price(float), serialNumber(String));
//2) Сабклас Monitor (resolutionX(int), resolutionY(int)) і EthernetAdapter (speed(int), mac(String)); Додати методи доступу. Конструктор.
//    Дивитися завдання 2. В обох класах перевизначити метод toString, щоб виведення було наступним:
//Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
//Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280, Y=1024
//Подивитися завдання 2. Перевизначити методи equals & hashCode у кожному класі.
// Створити клас Main, де створити об'єкти класів і продемонструвати перевизначені методи.

public class Device {

    private String manufacturer;
    private float price;
    private String serialNumber;

    public Device(String manufacturer, float price, String serialNumber){
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString(){
        return String.format("manufacturer = %s, price = %s, serialNumber = %s", manufacturer, price, serialNumber);
    }

    @Override
    public boolean equals(Object object){
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;
        Device device = (Device) object;
        if (this.manufacturer != device.manufacturer) return false;
        if (this.price != device.price) return false;
        if (this.serialNumber != device.serialNumber) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 18 * result + (manufacturer == null ? 0 : manufacturer.hashCode());
        result = 18 * result + (serialNumber == null ? 0 : serialNumber.hashCode());
        result = 18 * result + Float.floatToIntBits(price);

        return result;
    }

    // геттери та сеттери

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
