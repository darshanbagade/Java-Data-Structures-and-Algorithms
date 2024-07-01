// 26. Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
import java.util.Scanner;
public  class SumOfNegative_PositiveEvenOdd_In26{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int sum_negative=0;
        int sum_even=0;
        int sum_odd=0;
        int num;
        //apply while loop whennumber oasf repititions are not known
        while(true){
            num = in.nextInt();
            if(num==0)
                break;
            else if(num<0){
                sum_negative += num;
            }
            else if(num%2==0)
            {
                sum_even += num;
            }    
            else{
                sum_odd += num;
            }
        }
        System.out.println("Sum of negative number : " + sum_negative);
        System.out.println("Sum of positive even number : " + sum_even);
        System.out.println("Sum of positive odd number : " + sum_odd);
        
    }
}