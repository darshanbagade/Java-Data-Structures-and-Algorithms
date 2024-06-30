// package 2-Conditions & Loops.Codefile;

import java.util.Scanner;
/*
    Counting occurrence :-
        “Input two numbers, find that hoe many times second number
        digit is present in first number”
        Ex :- first number = 14458
        Second number = 4
        Output = 2, because 4 is present 2 times in first number. 
 */


public class CountOccurence {
    public static void main(String[] args) {

        @SuppressWarnings("resource") //to hide scanner leak warning

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int num = in.nextInt();

        System.out.println("Enter the Occurence the digit :");
        int digit = in.nextInt();
        
        int count = 0 ;
        while(num!=0)
        {
            if(num%10==digit)
            {
                count++;   
            }

            num/=10;
        }

        System.out.println("Occurence : " + count);
        
    }
    
}
