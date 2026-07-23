package carmanagment;

public class Car2 {

    private String brand;
    private String color;
    private int year;

    public void start() {
        System.out.println("Car is starting");
    }

    public void displayInfo() {
        System.out.println(brand + " " + color + " " + year);
    }

    public Car2(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
