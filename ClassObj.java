import java.util.Scanner;
class Arthematic{
    void perform(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Addition: "+(a+b));
        System.out.println("Subtraction: "+(a-b));
        System.out.println("Product: "+(a*b));
        System.out.println("Division: "+(a/b));
        sc.close();
    }
}
public class ClassObj {
    public static void main(String[] args) {
        Arthematic obj= new Arthematic();
        obj.perform();
    }
}
