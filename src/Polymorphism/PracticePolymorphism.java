package Polymorphism;

 interface Shape{
    double area();
}
class Circle implements Shape{
    int radius;
    Circle(int radius){
        this.radius = radius;
    }
    @Override
    public double area() {
        return 3.14*radius*radius;
    }
}
 class Rectangle implements Shape{
    int length;
    int breadth;
    Rectangle(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public double area() {
        return length*breadth;
    }
}
public class PracticePolymorphism {
    public static void main(String[] args) {
        Shape[] s=new Shape[2];
s[0]=new Circle(5);
s[1]=new Rectangle(10,15);
for(Shape shape: s){
    System.out.println(shape.area());
}
    }
}
