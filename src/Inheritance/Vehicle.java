package Inheritance;

public class Vehicle {
    String model;
    String color;
    int noOfDoors;

    public Vehicle(String model, String color, int noOfDoors) {

        this.model = model;
        this.color = color;
        this.noOfDoors = noOfDoors;

    }
    public void start() {
        System.out.println("Starting Vehicle");
    }
    public void stop() {
        System.out.println("Stopping Vehicle");
    }
}
