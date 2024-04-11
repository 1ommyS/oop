package order;

public class GmailSender implements Sender{
    @Override
    public void send(Order order, String to) {
        System.out.println("Sending by google mail");
    }
}
