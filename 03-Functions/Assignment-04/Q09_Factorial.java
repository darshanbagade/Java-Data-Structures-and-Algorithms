// 9. [Write a program to print the factorial of a number by defining a method named 'Factorial'.]
import java.util.Scanner;
public class Q09_Factorial {
       public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        System.out.println(Factorial(num));
    }
    static int Factorial(int num){
        int fact=1;
        if(num==0 || num ==1){        
            return 1;
        }
        for(int i=1 ; i<=num ; i++){
            fact = fact * i; 
        }
        return fact;
    }
    
}
