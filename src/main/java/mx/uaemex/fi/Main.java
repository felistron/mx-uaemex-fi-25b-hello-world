package mx.uaemex.fi;

import mx.uaemex.fi.patterns.adapter.PersonaDeliverAdapter;
import mx.uaemex.fi.patterns.factory.Ship;
import mx.uaemex.fi.patterns.factory.Transport;
import mx.uaemex.fi.patterns.factory.Truck;

public class Main {
    public static void main(String[] args) {
        usingAdapter();
    }

    private static void usingAdapter() {
        System.out.println("=====Usando patron Adapter=====");

        Transport transport;

        transport = new Ship("China", "México");
        transport.deliver();
        System.out.println(transport);

        transport = new Truck("Puerto de Veracruz", "Ciudad de Toluca");
        transport.deliver();
        System.out.println(transport);

        transport = new PersonaDeliverAdapter("Calle Benito Juarez 508");
        transport.deliver();
        System.out.println(transport);
    }
}
