import java.util.Scanner;

class Student{
    String name;
    int marks;
    Student(String n, int m){
        name=n;
        marks=m;
    }
    void display(){
        System.out.println("Name: " +name);
        System.out.println("Marks: " +marks);
    }
}
public class one {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the student name: ");
        String name= sc.nextLine();
        System.out.println("Enter the marks: ");
        int marks= sc.nextInt();
        Student s1 = new Student(name, marks);
        s1.display();
        sc.close();
    }
   
}
