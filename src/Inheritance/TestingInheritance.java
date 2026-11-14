package Inheritance;

public class TestingInheritance {
public static void main(String[] args) {
    Car c1=new Car("Innova","BLACK",4,4,2026,75);
    Car c2=new Car("Innova","BLACK",4,4,2024,81);
    Bike b1=new Bike("Pulser","red",0,65,2023);
    Bike b2=new Bike("Pulser","red",0,65,2023);
    c1.start();
    c2.start();
    b1.start();
    b2.start();
    c1.stop();
    c2.stop();
    b1.stop();
    b2.stop();
    c1.info("INNOVA","BLACK",4,4,2026,75);
}
}
