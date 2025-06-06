import java.util.Scanner;

interface Father{
    void getFatherDetails(Scanner sc);
    void showFatherDetails();
}
interface Mother{
    void getMotherDetails(Scanner sc);
    void showMotherDetails();
}
class Child implements Father,Mother{
    String FatherName, motherName, childName;
    int fatherAge,motherAge,childAge;
    String fatherJob,motherJob,childHobby;
    public void getFatherDetails(Scanner sc){
        System.out.println("Enter Fathers name: ");
        FatherName=sc.nextLine();
        System.out.println("Enter Fathers age: ");
        fatherAge=Integer.parseInt(sc.nextLine());
        System.out.println("Enter Fathers job: ");
        fatherJob=sc.nextLine();
    }
    public void showFatherDetails(){
        System.out.println("FATHER: "+FatherName+"| AGE: "+fatherAge+"| JOB: "+fatherJob);
    }
    public void getMotherDetails(Scanner sc){
        System.out.println("Enter Mothers name: ");
        motherName=sc.nextLine();
        System.out.println("Enter Mothers age: ");
        motherAge=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Mothers job: ");
        motherJob=sc.nextLine();
    }
    public void showMotherDetails(){
        System.out.println("MOTHER: "+motherName+"| AGE: "+motherAge+"| JOB: "+motherJob);
    }
    public void getChildDetails(Scanner sc){
        System.out.println("Enter Child name: ");
        childName=sc.nextLine();
        System.out.println("Enter Child age: ");
        childAge=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Child  Hobby: ");
        childHobby=sc.nextLine();
    }
    public void showChildDetails(){
        System.out.println("CHILD NAME: "+childName+"| AGE: "+childAge+"| JOB: "+childHobby);
    }
}
public class multipleinheri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Child c=new Child();
        System.out.println("----------ENTER FATHER DETAILS----------------");
        c.getFatherDetails(sc);
        System.out.println("----------ENTER MOTHER DETAILS----------------");
        c.getMotherDetails(sc);
        System.out.println("----------ENTER SON DETAILS----------------");
        c.getChildDetails(sc);
        c.showFatherDetails();
        c.showMotherDetails();
        c.showChildDetails();
        sc.close();

    }
    
}
