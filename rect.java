import java.util.Scanner;
public class rect{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the length of the rectangle:");
    double l = scanner.nextDouble();
    System.out.println("Enter the width of the rectangle:");
    double w = scanner.nextDouble();
    double area = l*w;
    System.out.printf("The area of the circle with radius %.2f  and %.2f is: %.2f",l,w, area);
    scanner.close();
}
}