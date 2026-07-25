package carmanagment;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Car2("Toyota", "Black", 2020);

        vehicle1.displayInfo();

        vehicle1.start();

        Vehicle vehicle2 = new ElectricCar("Tesla", "White", 2026, 100);

        vehicle2.displayInfo();

        vehicle2.start();

    }

}