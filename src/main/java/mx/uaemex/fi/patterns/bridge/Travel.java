package mx.uaemex.fi.patterns.bridge;

public class Travel implements WorkAction {
    @Override
    public void workActivity() {
        System.out.println("Viajando");
    }
}
