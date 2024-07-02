// 1.Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

import java.util.Scanner;
public class Q01_MaxMinOfThree {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.println("Enter thre numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int maxnum = Max(a,b,c);
        System.out.println("Max num is " + maxnum);
        int minnum = Min(a,b,c);
        System.out.println("Min num is " + minnum);
    }

    // method for max of three
    static int Max(int a,int b,int c){
        return (Math.max( a , Math.max( b , c ) ) );
    }    

    // method for min of three
    static int Min(int a,int b,int c){
        return (Math.min( a , Math.min( b , c ) ) );
    }
    
}
