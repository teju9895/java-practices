import java.util.Scanner;
public class atm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int pin = 1234;
    int balance = 5000;
    System.out.println("------WELCOME---------");
    System.out.println("Enter your pin: ");
    int password=sc.nextInt();
    if (password==pin){
        System.out.println("Enter the withdraw amount: ");
        int withdraw=sc.nextInt();
        if (withdraw<=balance){
            balance=balance-withdraw;
            System.out.println("Withdrawal successful ");
            System.out.println("Your current balance is: "+balance);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    else{
        System.out.println("Invalid pin");
    }
    System.out.println("----------THANKS FOR VISITING------");
   sc.close();  
  }  
}
