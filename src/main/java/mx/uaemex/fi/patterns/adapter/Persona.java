package mx.uaemex.fi.patterns.adapter;

public class Persona {
    private final String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void deliverPackage(String direccion) {
        System.out.println("El repartidor " + nombre + " esta entregando el paquete a la direccion " + direccion);
    }
}
