package mx.uaemex.fi.patterns.decorator;

public class SMSDecorator extends BaseDecorator {
    private final String number;

    public SMSDecorator(Notifier notifier, String number) {
        super(notifier);
        this.number = number;
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Enviando SMS a " + number);
    }
}
