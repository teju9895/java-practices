import java.util.Scanner;

class Animal{  //base class
    String name;
    void details(Scanner sc){
        System.out.println("Enter the name of the animal:");
        name = sc.nextLine();
    }
    void showanimal(){
        System.out.println("The name of the animal is: "+name);
    }

}
class mammal extends Animal{
    String type;
    void mammaltype(Scanner sc){
        System.out.println("Enter the type of mammal:");
        type = sc.nextLine();
    }
    void showmammal(){
        System.out.println("The type of mammal is: "+type);
    }
}
class dog extends mammal{
    String breed;
    void breeddetails(Scanner sc){
        System.out.println("Enter the breed of dog:");
        breed=sc.nextLine();
    }
    void showdog(){
        System.out.println("Dog breed:"+breed);
    }
}


public class multilevel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dog mydog = new dog();
        mydog.details(sc);
        mydog.mammaltype(sc);
        mydog.breeddetails(sc);

        mydog.showanimal();
        mydog.showmammal();
        mydog.showdog();
        sc.close();
    }
    
}
