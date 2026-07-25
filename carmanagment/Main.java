package carmanagment;

public class Main {

    public static void main(String[] args) {
        ElectricCar car = new ElectricCar("BYD", "Blue", 2025, 90);

        car.chargeBattery();

        Car2 car1 = new Car2("Toyota", "Black", 2020);

        car1.displayInfo();

        car1.start();

        ElectricCar car2 = new ElectricCar("Tesla", "White", 2026, 100);

        car2.displayElectricCarInfo();

        car2.start();

        car2.chargeBattery();

        Car2 car3 = new ElectricCar("BYD", "Blue", 2025, 90);

        car3.start();

    }

}