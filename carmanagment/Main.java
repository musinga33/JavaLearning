package carmanagment;

public class Main {

    public static void main(String[] args) {

        Car2 myCar = new Car2("Solento", "Black", 10000);

        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Color: " + myCar.getColor());
        System.out.println("Year: " + myCar.getYear());
        myCar.displayInfo();
        myCar.start();

        Car2 myCar2 = new Car2("BYD", "White", 2021);

        System.out.println("Brand: " + myCar2.getBrand());
        System.out.println("Color: " + myCar2.getColor());
        System.out.println("Year: " + myCar2.getYear());
        myCar2.displayInfo();
        myCar2.start();

        Car2 myCar3 = new Car2("Vios", "black", 2020);
        myCar3.setYear(500);
        myCar3.displayInfo();

        Car2 car1 = new Car2();
        car1.displayInfo();

        Car2 car2 = new Car2("BYD U1", "White", 2021);
        car2.displayInfo();

        ElectricCar tesla = new ElectricCar("Tesla", "White", 2026, 100);

        tesla.displayElectricCarInfo();

        tesla.start();

        tesla.chargeBattery();
    }
}