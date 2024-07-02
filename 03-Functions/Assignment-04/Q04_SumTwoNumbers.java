//04. Write a program to print the sum of two numbers entered by user by defining your own method.
import java.util.Scanner;
public class Q04_SumTwoNumbers {
    public static void main(String[] args) {
        add();
    }
    static void add()
    {
        @SuppressWarnings("resource")
        Scanner in = new Scanner (System.in);
        System.out.println("Enter two numbers : ");
        int a= in .nextInt();
        int b= in .nextInt();
        System.out.println("Sum is " + (a + b));
    }
}
