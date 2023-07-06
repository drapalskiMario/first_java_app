package design_patterns.creational;

public class Singleton {

    private Singleton singleton;

    private Singleton() {
    }

    public Singleton getInstance() {
        if (this.singleton == null) {
            this.singleton = new Singleton();
        }
        return this.singleton;
    }
}
