import java.util.Scanner;

// 7.To calculate Fibonacci Series up to n numbers.


public class Fibonacci {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in= new Scanner(System.in);

        System.out.print("Enter the value of n :");
        int n = in.nextInt();
        int a=0;
        int b=1;
        int c;
        for(int i=0;i<=n;i++)
        {
            System.out.print( a + " ");
            c=a+b;
            a=b;
            b=c;            
        }

    }
}
