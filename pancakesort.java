import java.util.Scanner;
public class pancakesort {
   public static void flip(int[] arr, int k){
    int left=0,right=k;
    while(left<right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
    }
   }
   static int findmaxindex(int[] arr, int n){
    int maxindex = 0;
    for (int i = 1; i<n;i++){
        if (arr[i] >arr[maxindex]){
            maxindex=i;
        }
    }
    return maxindex;
   }

   static void Pancakesort(int[] arr,int n){
    for(int size=n;size>1;size--){
        int maxindex = findmaxindex(arr, size);
        if(maxindex!=size-1){
            if(maxindex>0){
                flip(arr,maxindex);
            }
            flip(arr,size-1);
        }
    }

   }
   static void printarray(int[] arr){
        for (int num: arr){
            System.out.print(num+" ");
        }
        System.out.println();
   }
   
   public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the element:");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        Pancakesort(arr, n);
        System.out.println("Sorted array: ");
        printarray(arr);
        scan.close();
   }
    
}
