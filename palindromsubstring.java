import java.util.Scanner;
public class palindromsubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        int count=0;
        int len=s.length();
        System.out.println("Palindrome sub sequences/string");
        for(int i=0;i<len;i++){
            for(int j=i+1;j<=len;j++){
                String sub=s.substring(i,j);
                if(isPalindrome(sub)){
                    System.out.println(sub);
                    count++;
                }
            }
        }
        System.out.println("TOtal palindrome substring: "+count);
        sc.close();
}

public static boolean isPalindrome(String s) {
    int left=0;
    int right=s.length()-1;
    while(left<right){
        if(s.charAt(left)!=s.charAt(right)){
            return false;
        }
        left++;
        right--;
    }
    return true;

}
}