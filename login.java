import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the username: ");
        String username = sc.nextLine();

        System.out.println("Enter the password: ");
        String password = sc.nextLine();

        if (username.equals("Avula")) {
            if (password.equals("9895")) {
                System.out.println("Welcome");
            } else {
                System.out.println("Invalid password");
            }
        } else {
            System.out.println("Invalid username");
        }

        sc.close();
    }
}
