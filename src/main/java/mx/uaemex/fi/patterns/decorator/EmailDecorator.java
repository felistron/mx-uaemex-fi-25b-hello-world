package mx.uaemex.fi.patterns.decorator;

public class EmailDecorator extends BaseDecorator {
    private final String email;

    public EmailDecorator(Notifier notifier, String email) {
        super(notifier);
        this.email = email;
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Enviando email a " + email);
    }
}
