package carmanagment;

public class ElectricCar extends Car2 {

    private int battery;

    public ElectricCar(String brand, String color, int year, int battery) {

        super(brand, color, year);

        this.battery = battery;

    }

    @Override
    public void start() {

        System.out.println("Electric motor is starting silently");

    }

    @Override
    public void stop() {

        System.out.println("Electric car is stopping using regenerative braking");

    }

    public void chargeBattery() {

        System.out.println("Charging battery");

    }

}