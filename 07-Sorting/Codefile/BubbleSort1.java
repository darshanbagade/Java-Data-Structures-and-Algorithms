import java.util.Arrays;


public class BubbleSort1 {
    public static void main(String[] args) {
        int[] arr = {4,3,5,2,1};
        
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
