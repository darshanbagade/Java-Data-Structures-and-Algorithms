// 24. Take integer inputs till the user enters 0 and print the sum of all numbers

import java.util.Scanner;
public class SumOfAllNumbers_24 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int num= 1 ;
        int sum = 0;
        System.out.print("Enter the numbers : ");
        while(true)
        {
            if(num==0)
            {
                break;
            }
            num = input.nextInt();
            sum += num;
        }

        System.out.print("Sum is " + sum);
        
    }
    
}
