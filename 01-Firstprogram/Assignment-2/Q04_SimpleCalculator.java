// 4.Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;
public class Q04_SimpleCalculator{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.println("Selcet the option");
        System.out.println("+ for addition");
        System.out.println("- for subtraction");
        System.out.println("* for multiplication");
        System.out.println("/ for division : ");
        int ch = in.next().trim().charAt(0);
        System.out.println("Enter 1st number :");
        int num1  = in.nextInt();
        System.out.println("Enter 2nd number :");
        int num2 = in.nextInt();
        if(ch == '+')
            System.out.printf("Addition is %d", num1+num2);
        else if(ch == 'b')
            System.out.println("Subtraction is " );

    }  
}