import java.util.Arrays;
public class StringArraySort{
    public static void main(String[] args) {
        String[] bikes={"HD","BMW","RE","DUCATI","APRILLA"};
        Arrays.sort(bikes);
        System.out.println("Sorted arry: ");
        for(String  bike: bikes){
            System.out.println(bike +" ");
        }
        
    }
    
}
