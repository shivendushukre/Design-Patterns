package main.java.dp;

public class EagerInitialization {

    // eager way of creating singleton object
    private static final EagerInitialization eagerInitialization = new EagerInitialization();

    public static EagerInitialization getInstance() {
        return eagerInitialization;
    }
}
