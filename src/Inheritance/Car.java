package Inheritance;

public class Car extends Vehicle {

    int noOfWheels;
    int yearOfManufacture;
    int speed;

    Car(String model, String color, int noOfDoors,
        int noOfWheels, int yearOfManufacture, int speed) {

        super(model, color, noOfDoors);

        this.noOfWheels = noOfWheels;
        this.yearOfManufacture = yearOfManufacture;
        this.speed = speed;
    }

    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    public void info(String model,String color, int noOfDoors,
                     int noOfWheels, int yearOfManufacture, int speed) {
        System.out.println(this.model);
        System.out.println(this.color);
        System.out.println(this.noOfDoors);
        System.out.println(this.noOfWheels);
        System.out.println(this.yearOfManufacture);
        System.out.println(this.speed);
    }


}