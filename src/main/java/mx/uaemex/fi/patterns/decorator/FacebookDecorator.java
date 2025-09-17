package mx.uaemex.fi.patterns.decorator;

public class FacebookDecorator extends BaseDecorator {
    private final String username;

    public FacebookDecorator(Notifier notifier, String username) {
        super(notifier);
        this.username = username;
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Enviando mensaje a Facebook de " + username);
    }
}
