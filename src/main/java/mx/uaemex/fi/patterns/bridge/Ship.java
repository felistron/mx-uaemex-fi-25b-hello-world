package mx.uaemex.fi.patterns.bridge;

import mx.uaemex.fi.patterns.prototype.Prototype;

public class Ship extends TransportBridge {
    public Ship(WorkAction pickup, WorkAction travel, WorkAction deliver) {
        super(pickup, travel, deliver);
    }

    @Override
    public void deliver() {
        System.out.println("Enviando paquete mediante Ship");
        pickup.workActivity();
        travel.workActivity();
        deliver.workActivity();
    }

    @Override
    public Prototype copiar() {
        return null;
    }
}
