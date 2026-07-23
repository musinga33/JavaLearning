package carmanagment;

public class Main {

    public static void main(String[] args) {

        Car2 myCar = new Car2("Solento", "Black", 2020);

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

    }
}