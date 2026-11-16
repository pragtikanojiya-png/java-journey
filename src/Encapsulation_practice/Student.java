package Encapsulation_practice;

class Student_details {

    String name;
    int rollNo;

    static String collegeName = "PIEMR";

    Student_details(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println(name);
        System.out.println(rollNo);
        System.out.println(collegeName);
    }
}

public class Student {
    public static void main(String[] args) {

        Student_details s1 = new Student_details("Pragti", 101);
        Student_details s2 = new Student_details("Rahul", 102);
        Student_details s3 = new Student_details("Aman", 103);

        s1.display();
        s2.display();
        s3.display();

        Student_details.collegeName = "PIEMR Indore";

        s1.display();
    }
}
