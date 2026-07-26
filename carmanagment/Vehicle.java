package carmanagment;

import java.time.Year;

public abstract class Vehicle {

    public abstract void start();

    private String brand;
    private String color;
    private int year;

    public Vehicle(String brand, String color, int year) {

        this.brand = brand;
        this.color = color;
        setYear(year);

    }

    public Vehicle() {

        this.brand = "Unknown";
        this.color = "Unknown";
        this.year = 0;

    }

    public void displayInfo() {

        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);

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

    public void setYear(int year) {

        if (year >= 1886 && year <= Year.now().getValue()) {

            this.year = year;

        } else {

            System.out.println("Invalid year");

        }

    }

    // public void start() {

    // System.out.println("Vehicle is starting");

    // }
}