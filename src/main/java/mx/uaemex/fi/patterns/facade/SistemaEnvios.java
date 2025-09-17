package mx.uaemex.fi.patterns.facade;

public class SistemaEnvios {
    public void enviar(String producto, String direccion) {
        System.out.println("Enviando " + producto + " a " + direccion);
    }
}
