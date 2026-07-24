package carmanagment;

import java.time.Year;

public class Car2 {
    int currentYear() {
        return Year.now().getValue();
    }

    private String brand;
    private String color;
    private int year;

    public void start() {
        System.out.println("Car is starting");
    }

    public void displayInfo() {

        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);

    }

    public Car2(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        setYear(year);
    }

    public Car2() {
        this.brand = "Unknown";
        this.color = "Unknown";
        this.year = 0;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.isEmpty()) {
            this.brand = brand;
        } else {
            System.out.println("Invalid brand name");
        }
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

    // public void setYear(int year) {
    // this.year = year;
    // }

    public void setYear(int year) {

        if (year >= 1886 && year <= currentYear()) {
            this.year = year;
        } else {
            System.out.println("Year must be between 1886 and the current year");
        }

    }
}
