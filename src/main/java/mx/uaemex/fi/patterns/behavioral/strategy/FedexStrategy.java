package mx.uaemex.fi.patterns.behavioral.strategy;

public class FedexStrategy implements TransportStrategy {
    @Override
    public void deliver(String packageId) {
        System.out.println("Enviando por Fedex el paquete con el ID: " + packageId);
    }
}
