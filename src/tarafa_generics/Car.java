package tarafa_generics;

class Car {
    private String model;
    private String manufacturer;

    public Car(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
