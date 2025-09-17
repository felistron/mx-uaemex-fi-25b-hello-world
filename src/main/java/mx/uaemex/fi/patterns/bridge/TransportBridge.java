package mx.uaemex.fi.patterns.bridge;

import mx.uaemex.fi.patterns.factory.Transport;

public abstract class TransportBridge implements Transport {
    public WorkAction pickup;
    public WorkAction travel;
    public WorkAction deliver;

    public TransportBridge(WorkAction pickup, WorkAction travel, WorkAction deliver) {
        this.pickup = pickup;
        this.travel = travel;
        this.deliver = deliver;
    }
}
