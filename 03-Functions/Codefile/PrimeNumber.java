
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the numnber : ");
        int n = in.nextInt();

        boolean ans = is_prime(n);
        System.out.println(ans);
    }
    static boolean is_prime(int n)
    {
        if(n<=1)        {
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0)
            {
                return false;
            }
            c++;
        }
        // if(c*c>n){
        //     return true;
        // }
        return c*c>n;
    }
}
