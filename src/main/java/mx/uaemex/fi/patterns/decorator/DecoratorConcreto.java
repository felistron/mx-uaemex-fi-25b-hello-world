package mx.uaemex.fi.patterns.decorator;

public class DecoratorConcreto implements Notifier {

    @Override
    public void send(String message) {
        System.out.println("Mensaje: " + message);
    }
}
