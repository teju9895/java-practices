import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int r=0;
        while(num>0){
           int  d=num%10;
            r=r*10+d;
            num/=10;
        }
        System.out.println(r);
        sc.close();
    }

    
}
