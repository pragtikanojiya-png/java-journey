 class Student {
    int RollNo;
    String Name;
    int Age;
    String Branch;
    double CGPA;

    Student(int RollNo, String Name, String Branch,int Age, double CGPA){
        this.RollNo=RollNo;
        this.Name=Name;
        this.Age=Age;
        this.Branch=Branch;
        this.CGPA=CGPA;
    }
    void printInfo(){
        System.out.println("--------STUDENT INFORMATION------");
        System.out.println("Roll No: "+RollNo);
        System.out.println("Name: "+Name);
        System.out.println("Age: "+Age);
        System.out.println("Branch: "+Branch);
        System.out.println("CGPA: "+CGPA);
        System.out.println("---------------------------------");

    }
                @Override
public String  toString() {
    return "Roll no :" + RollNo  +
            ", Name: " + Name +
            ", Age: " + Age +
            ", Branch: " + Branch +
            ", CGPA: " + CGPA   ;
}
 }
          public class ObjectPractice{
    public static void main(String[] args)  {
        Student s1=new Student(1,"Raj","CSE",20,8.23);
        Student s2=new Student(2,"Shivam","CSE",20,7.93);
        Student s3=new Student(3,"Vivek","CSE",21,8.93);

        s1.printInfo();
        s2.printInfo();
        s3.printInfo();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
          }