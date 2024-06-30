
import java.util.Scanner;

// package Assignment-2;

public class SimpleInterest {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Principle amount, time & rate:");
        int principle = input.nextInt();        
        float time = input.nextFloat(); 
        float rate =  input.nextFloat();

        System.out.println("Simple Interest : " + (float)(principle*time*rate)/100 );

        
    }  
}
