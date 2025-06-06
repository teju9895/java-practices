//write a program to perform the operations using multilevel inheritance
//of pow anf factorial of the given values,
//where the base class would be input of the varables and the derived class1 
//and class2 with be extended accordingly of pow and factorial
//a=5,b=3,power 5^3=125,fact of 5=120,fact of 3=6
import java.util.Scanner;
class InputNumber{
    int a,b;
    void getInput(Scanner sc){
        System.out.println("Enter the value of a: ");
        a=sc.nextInt();
        System.out.println("Enter the value of b: ");
        b=sc.nextInt();
    }
}
class powerCal extends InputNumber{
    void power(){
        int result=1;
        for(int i=1;i<=b;i++){
            result*=a;
        }
        System.out.println("The power of ("+a+"^"+b+"): "+result);
    }
}

class factorialCal extends powerCal{
    int  factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;    
        }
        return fact;
    }
    void showFactorial(){
        System.out.println("Factorial of"+a+":"+factorial(a));
        System.out.println("Factorial of"+b+":"+factorial(b));
    }
}
public class factpow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        factorialCal obj=new factorialCal();
        obj.getInput(sc);
        System.out.println();
        obj.power();
        System.out.println();
        obj.showFactorial();
        sc.close();
    }
    
}
