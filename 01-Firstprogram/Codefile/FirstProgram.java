package Codefile;
// package Firstprogram;

import java.util.Scanner;



/*
 * public static void main()
 * public   ----> this code ccan be accessiible anywhere 
 * static  ----> static is used to call main() function of the class without creating the object 
 * void    ----> void means the function does not return anything 
 * main()  ----> main() is the entry point of the program , without main() code will not execute
 *  
 */



public class FirstProgram {
    public static void main(String[] args) {
        
        //In java, when two reference variables pointing to the same object , if we change the value of any one of the object it changes for the other referance variable also.
        //only for objects becoz premitives directly store value/data into the refernce variables
        // int[] {1,2,3};
        // int[] b = {1,2,3};
        // System.out.println("a = " + Arrays.toString(a));
        // System.out.println("b = " + Arrays.toString(a));
        // a[0]=100;
        // System.out.println("a = " + Arrays.toString(a));
        // System.out.println("b = " + Arrays.toString(a)); a =
        
        /* 
        -----------------------------------------------
        *   in.next();                   ---->     it takes only first word of the string 
        *   in.nextLine() ;              ---->     it takes complete string as a input
        *   in.nextInt() ;               ---->     it takes Integer as a input
        *   in.nextfloat() ;             ---->     it takes float as a input
        *   in.next().charAt(index:0) ;  ---->     it takes char as a input
        -----------------------------------------------
        */  
        
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter character: ");
        char myChar = in.next().charAt(0);
        System.out.println(myChar);

        //-----------------------------------------------

        // System.out.println("Enter your marks :");
        // float mark = in.nextFloat();

        /*
             it reads the float value but leaves the newline character (\n) in the input buffer. As a result, when in.nextLine() is called next, it reads this leftover newline character, causing it to skip the actual input prompt.
        */

        
        // in.nextLine();  // Consume the leftover newline character
        // System.out.println(mark);
        
        
        // System.out.println("What is your name?");
        // String name = in.nextLine();
        // System.out.println(name);

    }
}
