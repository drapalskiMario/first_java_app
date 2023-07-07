package tarafa_generics;

import java.util.ArrayList;
import java.util.List;

public class ListOfCars<T extends Car> {

    private List<T> cars;

    public ListOfCars() {
        this.cars = new ArrayList<>();
    }

    public void addCar(T carro) {
        cars.add(carro);
    }

    public void removeCar(T carro) {
        cars.remove(carro);
    }

    public void printCar() {
        for (T car : cars) {
            System.out.println(car);
        }
    }
}
