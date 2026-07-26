package carmanagment;

public class Main {

    public static void main(String[] args) {

        Car2 car = new Car2("Toyota", "Black", 2020);

        car.start();

        car.stop();

        ElectricCar tesla = new ElectricCar("Tesla", "White", 2026, 100);

        tesla.start();

        tesla.stop();

        tesla.chargeBattery();

    }

}