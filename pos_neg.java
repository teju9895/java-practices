import java.util.Scanner;
public class pos_neg {  //pos or neg number using if else if condition
    public static void main(String[] args) {
        Scanner take=new Scanner(System.in);
        int num=take.nextInt();
        if(num>0){
            System.out.println("POSITIVE");
        }
        else if (num<0) {
            System.out.println("NEGATIVE");
        } else {
            System.out.println("ZERO");
        }  
        take.close();  
    }
}
