package order;

public class TelegramSender extends SendAbstract {
    @Override
    public void send(Order order, String to) {
        System.out.println("Отправили сообщение в телеграмме");
    }
}
