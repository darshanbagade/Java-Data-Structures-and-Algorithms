// 3. [A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.]
import java.util.Scanner;
public class Q03_EligibleOrNot{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age = in.nextInt();
        EvenOdd(age); 
    }
    static void EvenOdd(int n){
        if(n>=18){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
    
}