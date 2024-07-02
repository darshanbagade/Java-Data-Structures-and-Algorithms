// 7. Write method to check input number is prime or not
import java.util.Scanner;
public class Q07_PrimeOrNot {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the num : ");
        int num = in.nextInt();
        System.out.println(IsPrime(num));
    }
    static boolean IsPrime(int num){
        if(num==0 || num==1){
            return false;
        }
        int c=2;
        while(c*c<=num){
            if(num%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
