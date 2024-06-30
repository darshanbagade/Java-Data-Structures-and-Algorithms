
import java.util.Scanner;

// package Assignment-2;

public class Greeting {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        System.out.println("Hello " + input.next());
    }
    
}
