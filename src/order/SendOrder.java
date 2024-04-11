package order;

public class SendOrder {
    private Sender sender;

    public SendOrder() {
//        sender = new TelegramSender();
//        sender = new GmailSender();
    }

    public void sendOrder(Order order, String to) {
        // какая-то ультра сложная логика хз какая


        sender.send(order, to);
    }
}
