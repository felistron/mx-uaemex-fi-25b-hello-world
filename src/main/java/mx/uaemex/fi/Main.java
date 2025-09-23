package mx.uaemex.fi;

import mx.uaemex.fi.patterns.behavioral.strategy.Context;
import mx.uaemex.fi.patterns.behavioral.strategy.CorreosDeMexicoStrategy;
import mx.uaemex.fi.patterns.behavioral.strategy.DHLStrategy;
import mx.uaemex.fi.patterns.behavioral.strategy.FedexStrategy;

public class Main {
    public static void main(String[] args) {
        usingStrategy();
    }

    private static void usingStrategy() {
        System.out.println("=====Usando patron Strategy=====");

        Context context = new Context(new FedexStrategy());
        context.deliver("Paquete 1");

        context.setStrategy(new DHLStrategy());
        context.deliver("Paquete 2");

        context.setStrategy(new CorreosDeMexicoStrategy());
        context.deliver("Paquete 3");
    }
}