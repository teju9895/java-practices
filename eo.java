import java.util.Scanner;
public class eo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if (num%2==0)
            System.out.println("EVEN");
        else
            System.out.println("ODD");
        sc.close();    
    }
}
