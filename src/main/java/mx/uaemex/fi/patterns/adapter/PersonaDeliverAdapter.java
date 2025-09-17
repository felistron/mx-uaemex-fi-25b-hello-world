package mx.uaemex.fi.patterns.adapter;

import mx.uaemex.fi.patterns.factory.Transport;
import mx.uaemex.fi.patterns.prototype.Prototype;

public class PersonaDeliverAdapter implements Transport {
    private final String direccion;

    public PersonaDeliverAdapter(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public void deliver() {
        Persona persona = new Persona("Jose");
        persona.deliverPackage(direccion);
    }

    @Override
    public Prototype copiar() {
        return new PersonaDeliverAdapter(direccion);
    }
}
