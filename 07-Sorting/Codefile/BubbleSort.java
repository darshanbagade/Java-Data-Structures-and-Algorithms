
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = new int[5];
        try (Scanner in = new Scanner(System.in)) {
            for(int i=0; i<5 ;i++){
                arr[i]=in.nextInt();
            }
        }
        
        System.out.println(Arrays.toString(arr));
                bubblesort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubblesort(int[] arr){
        int n = arr.length;
        for(int i=0;i<arr.length-1 ;i++){
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1]){
                    swap(arr,j);
                }
            }
        }
    }
    public static void swap(int arr[],int j){
        int temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;

    }

}
