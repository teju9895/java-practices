import java.util.Scanner;
public class UserInputArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] marks=new int[5];
        System.out.println("Enter 5 subject marks:");
        for(int i=0;i<marks.length;i++){
            marks[i]=scan.nextInt();
            System.out.println("Element at index"+(i+1)+":"+marks[i]);
        }
        scan.close();
    }
    
}
