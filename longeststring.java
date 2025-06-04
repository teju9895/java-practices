

public class longeststring{
    public static void main(String[] args) {
        String[] bikes={"HD","BMW","RE","DUCATI","APRILLA"};
        String longest=" ";
        for(String bike: bikes){
            if(bike.length()>longest.length()){
                longest=bike;
            }
        }
        System.out.println(longest);
      
        }
        
    }
    


