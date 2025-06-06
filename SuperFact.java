import java.util.Scanner;
class Superfactorial{
    int factorial(int n){
        int fact = 1;
        for(int i = 1; i <=n;i++){
            fact = fact * i ;
        }
        return fact;
    }
    long clacfact(int n){
        long sf = 1;
        for(int i = 1; i <=n;i++){
            sf = sf * factorial(i);
        }
        return sf;
    }
}

public class SuperFact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Superfactorial sf = new Superfactorial();
        System.out.println("Enter a number");
        int n = sc.nextInt();
        long result = sf.clacfact(n);
        System.out.println("Superfactorial of " + n + " is " + result);
        sc.close();
    }
    
}
