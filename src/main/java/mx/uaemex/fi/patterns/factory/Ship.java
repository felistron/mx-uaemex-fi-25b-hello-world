package mx.uaemex.fi.patterns.factory;

import mx.uaemex.fi.patterns.prototype.Prototype;

public class Ship implements Transport {
    private final String origen;
    private final String destino;

    public Ship(String origen, String destino) {
        this.origen = origen;
        this.destino = destino;
    }

    @Override
    public void deliver() {
        System.out.println("Enviando paquete mediante Ship desde " + origen + " hacia " + destino);
    }

    @Override
    public Prototype copiar() {
        return new Ship(origen, destino);
    }
}
