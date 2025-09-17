package mx.uaemex.fi.patterns.bridge;

public class Pickup implements WorkAction {
    private final String direccion;

    public Pickup(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public void workActivity() {
        System.out.println("Recogiendo paquete en " + direccion);
    }
}
