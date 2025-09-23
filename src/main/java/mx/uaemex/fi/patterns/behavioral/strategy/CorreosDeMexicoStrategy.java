package mx.uaemex.fi.patterns.behavioral.strategy;

public class CorreosDeMexicoStrategy implements TransportStrategy {
    @Override
    public void deliver(String packageId) {
        System.out.println("Enviando por Correos de México el paquete con el ID: " + packageId);
    }
}
