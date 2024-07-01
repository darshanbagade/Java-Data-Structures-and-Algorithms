import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        sum();
    }
    static void sum()
    {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        int num1,num2,sum;
        System.out.print("Enter number 1 : ");
        num1 = in.nextInt();
        System.out.print("Enter number 2 : ");
        num2 = in.nextInt();
        sum= num1 + num2;
        System.out.print("Sum is : " + sum );
    }
    
}
