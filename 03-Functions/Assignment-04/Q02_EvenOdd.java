//2. Even or odd number using functions
import java.util.Scanner;
public class Q02_EvenOdd {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = in.nextInt();
        EvenOdd(n); 
    }
    static void EvenOdd(int n){
        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    
}
