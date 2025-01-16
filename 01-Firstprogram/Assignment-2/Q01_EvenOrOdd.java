// 1.Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;
public class Q01_EvenOrOdd{
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the number :");
            int num=in.nextInt();
            if( num%2 == 0){
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
        }
    }
}