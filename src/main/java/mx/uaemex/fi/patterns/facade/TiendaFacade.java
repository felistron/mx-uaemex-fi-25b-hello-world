package mx.uaemex.fi.patterns.facade;

public class TiendaFacade {
    private final SistemaInventario sistemaInventario;
    private final SistemaEnvios sistemaEnvios;
    private final SistemaPagos sistemaPagos;

    public TiendaFacade() {
        this.sistemaInventario = new SistemaInventario();
        this.sistemaEnvios = new SistemaEnvios();
        this.sistemaPagos = new SistemaPagos();
    }

    public void comprar(String producto, String direccion) {
        System.out.println("Comprando " + producto);

        if (sistemaInventario.comprobarExistencia(producto)) {
            sistemaInventario.reservar(producto);
            sistemaPagos.realizarPago(producto, 100);
            sistemaEnvios.enviar(producto, direccion);
        } else {
            System.out.println("No hay stock de " + producto);
        }
    }
}
