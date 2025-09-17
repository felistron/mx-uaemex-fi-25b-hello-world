package mx.uaemex.fi.patterns.facade;

public class SistemaPagos {
    public void realizarPago(String producto, double monto) {
        System.out.println("Realizando pago de " + monto + " para el producto " + producto);
    }
}
