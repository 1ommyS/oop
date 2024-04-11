package order;

/*
интерфейс - набор контрактов
реализуя интерфейс, мы должны реализовать каждый из контрактов
 */

public interface Sender {
    void send(Order order, String to);
}
