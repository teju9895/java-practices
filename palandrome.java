import java.util.Scanner;
public class palandrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str1=sc.nextLine();
        String clean=str1.replace("\\s+", "").toLowerCase();
        boolean isPalindrome=true;
        int left=0;
        int right = clean.length()-1;
        while(left<right){
            if(clean.charAt(left)!=clean.charAt(right)){
                isPalindrome=false;
                break;
            }
            left++;
            right--;
        }
        if(isPalindrome){
            System.out.println("It is a palindrome!!");
        }
        else{
            System.out.println("It is not a palindrome!!");
        }
        sc.close();
    }
    
}
