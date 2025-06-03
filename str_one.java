import java.util.Scanner;
public class str_one {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1=sc.nextLine();
        System.out.println("Enter the second string:");
        String str2=sc.nextLine();
        String result=str1 + str2;
        String Result=str1.concat(str2);
        boolean areEqual = str1.equals(str2);
        System.out.println(Result);
        System.out.println(result);
        System.out.println("The strings \""+str1+ "\" and \"" +str2+"\" are " + (areEqual ? "equal":"not equal") );
        sc.close();
    }
}
