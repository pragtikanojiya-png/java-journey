package Inheritance;

public class Bike extends Vehicle{
    int speed;
    int yearOfProduction;
    Bike( String Model,String Color,int noOfDoors,int speed, int yearOfProduction) {
        super(Model, Color, noOfDoors);
        this.speed = speed;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public void start() {
        System.out.println("Bike is starting");
    }
    @Override
    public void stop(){
        System.out.println("Bike is stopping");
    }
}
