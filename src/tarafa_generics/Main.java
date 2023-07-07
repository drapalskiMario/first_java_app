package tarafa_generics;

public class Main {
    public static void main(String[] args) {
        var listOfCars = new ListOfCars<Car>();
        var tesla = new Tesla("Model S", "Tesla");
        var toyota = new Ford("Camaro", "Ford");

        listOfCars.addCar(tesla);
        listOfCars.addCar(toyota);

        listOfCars.printCar(); // Exibe os carros adicionados
    }
}
