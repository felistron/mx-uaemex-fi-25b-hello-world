package mx.uaemex.fi.patterns.behavioral.strategy;

public class DHLStrategy implements TransportStrategy {
    @Override
    public void deliver(String packageId) {
        System.out.println("Enviando por DHL el paquete con el ID: " + packageId);
    }
}
