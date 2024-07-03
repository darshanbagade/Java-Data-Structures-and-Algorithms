import java.util.Arrays;
import java.util.Scanner;

public class maxInArray{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc =new  Scanner(System.in);
        System.out.println("Enter the array Elements : ");
        int[] arr = new int[5];

        //to take array input
        for(int i= 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        //max of arr
        int max = arr[0];
        for(int x=1 ; x<arr.length ; x++)
        {
            if(arr[x]>max)
            {
                max = arr[x];
            }
        }
        System.out.println("max : " + max );
    }
}