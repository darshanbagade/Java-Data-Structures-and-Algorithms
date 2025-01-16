// 3.Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.*;
public class Q03_SimpleInterest{
    public static void main(String[] args){
        // the Scanner object is created within the try-with-resources statement, ensuring that it will be closed automatically when the try block is exited.
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter principle value : ");
            float p = in.nextFloat();
            System.out.println("Enter time in years : ");
            float t = in.nextFloat();
            System.out.println("Enter rate: ");
            float r = in.nextFloat();
            float result  = (p*t*r)/100;
            System.out.println("Simple Interest :" + result);
        }
        
    }
}
