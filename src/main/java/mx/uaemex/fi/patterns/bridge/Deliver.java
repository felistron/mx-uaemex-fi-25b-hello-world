package mx.uaemex.fi.patterns.bridge;

public class Deliver implements WorkAction {
    private final String direccion;

    public Deliver(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public void workActivity() {
        System.out.println( "Entregando paquete a " + direccion);
    }
}
