/*
  4.Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
 */


import java.util.Scanner;

public class SimpleCalculator {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("Enter the sign :");
        char ch =in.next().charAt(0);
        
        if(ch == '+'){
            System.out.println("Addintiton is :" +( num1+num2) );
        }
        else if(ch=='-')
        {
            System.out.println("Subtraction is "+ (num1-num2) );
        }
        else if( ch == '*')
        {
            System.out.println("MUltiplication is " + (num1*num2));
        }
        else if(ch == '/'){
            if(num2==0){
                System.out.println("Denominator can not be zero.");
            }
            else{
                System.out.println("Division is " + (num1/num2));
            }
            
        }
        else{
            System.out.println("Enter the correct sign.");
        }


    }
}
