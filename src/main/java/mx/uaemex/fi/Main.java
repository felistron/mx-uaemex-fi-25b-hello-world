package mx.uaemex.fi;

import mx.uaemex.fi.patterns.facade.TiendaFacade;

public class Main {
    public static void main(String[] args) {
        usingFacade();
    }

    private static void usingFacade() {
        System.out.println("=====Usando patron Facade=====");
        TiendaFacade tiendaFacade = new TiendaFacade();
        tiendaFacade.comprar("Arroz", "Calle 1 #123");
    }
}