
import java.util.Scanner;

// package Assignment-2;

public class EvenOdd {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the number : ");
        int num = in.nextInt();


        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

        
        
    }
    
}
