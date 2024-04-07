/*
Класс для хранения информации о продуктовой корзине
 */

/*
класс - то что в этом файле, класс ОДИН
объект (экземпляр) класса - набор полей с определенными значениями
 */
public class Bucket {
    private int capacity;
    public String[] products;

    /*
    1) public - поля и методы класса доступны всем
    2) private - поля и методы класса доступны только нам, больше никому
    3) protected - поля и методы класса доступны только нам и нашим детям
    4) default (package-private) - только внутри пакета
     */

    /*
    конструктор - это метод с именем класса
    конструктор вызывается автоматически при создании объекта
    */
    public Bucket(int capacity) {
        this.capacity = capacity;
        products = new String[capacity];
    }




    public Bucket() {
        capacity = 5;
        products = new String[capacity];
    }

    public void addProduct(String product) {
        products[capacity + 1] = product;
    }

    private void setCapacity(int newCapacity) {
        capacity = newCapacity;
    }

    public int getCapacity() {
        return capacity;
    }

}
