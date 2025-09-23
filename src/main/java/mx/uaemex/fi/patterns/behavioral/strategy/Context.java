package mx.uaemex.fi.patterns.behavioral.strategy;

public class Context {
    private TransportStrategy strategy;

    public Context(TransportStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(TransportStrategy strategy) {
        this.strategy = strategy;
    }

    public void deliver(String packageId) {
        strategy.deliver(packageId);
    }
}
