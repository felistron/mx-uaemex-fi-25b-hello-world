package mx.uaemex.fi;

import mx.uaemex.fi.patterns.adapter.PersonaDeliverAdapter;
import mx.uaemex.fi.patterns.bridge.Deliver;
import mx.uaemex.fi.patterns.bridge.Pickup;
import mx.uaemex.fi.patterns.bridge.TransportBridge;
import mx.uaemex.fi.patterns.bridge.Travel;
import mx.uaemex.fi.patterns.factory.Ship;
import mx.uaemex.fi.patterns.factory.Transport;
import mx.uaemex.fi.patterns.factory.Truck;

public class Main {
    public static void main(String[] args) {
        usingAdapter();
        usingBridge();
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

    private static void usingBridge() {
        System.out.println("=====Usando patron Bridge=====");

        TransportBridge transport;

        transport = new mx.uaemex.fi.patterns.bridge.Ship(
                new Pickup("China"),
                new Travel(),
                new Deliver("México")
        );
        transport.deliver();
        System.out.println(transport);

        transport = new mx.uaemex.fi.patterns.bridge.Truck(
                new Pickup("Puerto de veracruz"),
                new Travel(),
                new Deliver("Ciudad de Toluca")
        );
        transport.deliver();
        System.out.println(transport);
    }
}
