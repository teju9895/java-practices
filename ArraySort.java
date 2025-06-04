import java.util.Arrays;
public class ArraySort{
    public static void main(String[] args) {
        int[] numbers={77,6,33,98,99};
        int sum=0;
        Arrays.sort(numbers);
        System.out.println("Sorted arry: ");
        for(int num: numbers){
            System.out.println(num +" ");
        }
        for(int num: numbers){
            sum+=num;
        }
        System.out.println("SUM = "+sum);
    }
    
}
