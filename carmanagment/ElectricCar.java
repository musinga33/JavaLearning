package carmanagment;

public class ElectricCar extends Car2 {
    private int battery;

    public ElectricCar(String brand, String color, int year, int battery) {
        super(brand, color, year);
        this.battery = battery;
    }

    public void chargeBattery() {
        System.out.println("Charging battery");
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public void displayElectricCarInfo() {

        displayInfo();

        System.out.println("Battery: " + battery + "%");

    }
}