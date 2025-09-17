package mx.uaemex.fi.patterns.facade;

public class SistemaInventario {
    public boolean comprobarExistencia(String producto) {
        System.out.println("Comprobando existencia de " + producto);
        return true;
    }

    public void reservar(String producto) {
        System.out.println("Reservando " + producto);
    }
}
