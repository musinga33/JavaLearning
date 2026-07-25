package carmanagment;

public class Car2 extends Vehicle {

    public Car2(String brand, String color, int year) {

        super(brand, color, year);

    }

    public Car2() {

        super("Unknown", "Unknown", 0);

    }

    @Override
    public void start() {

        System.out.println("Car is starting");

    }

}