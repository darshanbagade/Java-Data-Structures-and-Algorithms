// 25. Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;
public class LargestNumTillZero_25 {
    public static void main(String[] args) {

        int num=1;
        int max=0;
        System.out.println("Enter the number :");
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);

        //loop will run till it breaks ,inside the if condition
        while(true){

            if(num==0){
                break; // loop will end here
            }

            num = in.nextInt();
            max = Math.max(max,num);
        }
        System.out.print("Max number : " + max );
    }
    
}
