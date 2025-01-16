// 7.To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;
public class Q07_Fibonacci {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.println("Enter the value of n: ");
            int n = in.nextInt();
            int a = 0;
            int b = 1;
            int c ; 
            for(int i=0 ; i< n ; i++){
                System.out.println(a +" ");
                c = a + b;
                a = b;
                b = c;
            }
        }
    }
}
