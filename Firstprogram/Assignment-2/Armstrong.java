import static java.lang.Math.pow;
import java.util.Scanner;

// 9.To find Armstrong Number between two given number.

public class Armstrong {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in =new Scanner(System.in);

        System.out.println("Enter two numbers :");
        int a= in.nextInt() ;
        int b= in.nextInt() ;
        for(int i=a ; i<=b ; i++)
        {
            int org=i;
            int digits=0;
            //counting number of digits
            while(org!=0) 
            {
                digits++;
                org/=10;
            }

            org=i;
            int sum=0;
            //calculating armstorng
            while(org!=0)
            {
                sum= (int) (sum + pow(org % 10,digits));
                org=org/10;
            }

            //checking armstorng or not 
            if(sum==i)
            {
                System.out.print(i + " ");
            }
        }
    }
}