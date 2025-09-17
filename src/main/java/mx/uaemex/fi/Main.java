package mx.uaemex.fi;

import mx.uaemex.fi.patterns.decorator.*;

public class Main {
    public static void main(String[] args) {
        useDecorator();
    }

    private static void useDecorator() {
        System.out.println("=====Usando patron Decorator=====");

        Notifier notifier = new DecoratorConcreto();
        notifier = new SMSDecorator(notifier, "+521333444555");
        notifier = new EmailDecorator(notifier, "juan.perez@mail.com");
        notifier = new FacebookDecorator(notifier, "juan.perez");
        notifier.send("Hola mundo!");
    }
}