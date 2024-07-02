// 13. [Write a function that returns all prime numbers between two given numbers.]
import java.util.Scanner;
public class Q13_PrimeBtwTwoNumbers {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner (System.in);
        System.out.println("Enter nth number : ");
        int num1= in .nextInt();
        int num2= in .nextInt();
        prime_num(num1,num2);
    }
    static void prime_num(int a,int b){
        for(int i=a ; i<=b ; i++){            
            if(IsPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    //Checks number is prime or not
    static boolean IsPrime(int num){
        int c=2;
        if(num == 1 || num == 0){
            return false;
        }
        while(c*c <= num){
            if(num%c==0){
                return false;
            }
            else{
                c++;
            }
        }
        return c*c>num;
    }
    
}
