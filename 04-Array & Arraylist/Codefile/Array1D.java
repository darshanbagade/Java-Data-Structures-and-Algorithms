
import java.util.Arrays;
import java.util.Scanner;

public class Array1D{
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        
        //1D array 
        int[] arr ; //Declaration - memory creation in stack
        arr = new int[5]; //intialisation - creating  object in heap

        // int[] arr1 = { 1,2,3,4,5}; //approach 2 

        // input
        for(int i=0 ; i < arr.length ; i++)
        {
            arr[i] = in.nextInt();
        }

        //output - Approach -1
        // for( int i=0 ; i<arr.length ; i++){
            //     System.err.print( arr[i] + " ");
            // }

        //Approach -2
        System.out.println(Arrays.toString(arr));


        }
}