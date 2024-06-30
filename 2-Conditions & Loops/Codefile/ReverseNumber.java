import java.util.Scanner;
// package 2-Conditions & Loops.Codefile;

    /*
        Reverse a number :
        “ A number I input from the keyboard and Show the output as
        Reverse of that number “
        Example :- Input :- 12345
        Output :- 54321
     */

public class ReverseNumber {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = in.nextInt();

        int reverse=0;

        while(num!=0)
        {
            reverse = 10 * reverse + num%10 ;
            num = num/10; 
        }
        System.out.println("Reversed number :" + reverse);


    }
    
}
