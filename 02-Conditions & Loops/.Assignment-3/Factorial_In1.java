import java.util.Scanner;
public class Factorial_In1{
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int fact=1;
        for(int i=num ; i>=1 ; i--)
        {
            fact = fact * i;
        }
        if(num==0 || num==1){
            System.out.println("Factorial : 1");
        }
        else{
            System.out.println("Factorial : " + fact);
        }

    }
}