import java.util.Scanner;

//5.Take 2 numbers as input and print the largest number.


public class LargestNumber{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int num1= in.nextInt();
        int num2= in.nextInt();
        if(num1>num2)
        {
            System.out.println("Largest number : " + num1);
        }
        else{
            System.out.println("Largest number : " + num2);
        }
    }
}