import java.util.Scanner;
import java.util.Arrays;
public class anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1=sc.nextLine();
        System.out.println("Enter the second string: ");
        String str2=sc.nextLine();
        str1=str1.replaceAll("\\s","").toLowerCase();
        str2=str2.replaceAll("\\s","").toLowerCase();
        if(str1.length()!=str2.length()){
            System.out.println("The strings are not  anagram with each other:");
        }
        else{
            char[] arr1=str1.toCharArray();
            char[] arr2=str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            boolean isAnagram =Arrays.equals(arr1,arr2);
            if(isAnagram){
                System.out.println("The strings are anagrams");
            }
            else{
                System.out.println("The strings not  anagrams");
            }
        }
        sc.close();
    }
    
}
