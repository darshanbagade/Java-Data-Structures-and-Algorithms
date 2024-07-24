/* Insertion sort --> Sorting the array from the left
                  --> Best time complexity O(N)
                  --> Worst time complexity O(N^2)
                  --> Adaptive
                  -->Use for small size of array
*/
import java.util.Arrays;

public class InsertionSort{
    public static void main(String[] args){
        int[] arr ={ 5,4,-5,2,1};
        System.out.println(Arrays.toString(arr));
        Insertion(arr,arr.length);
        System.out.println(Arrays.toString(arr));

    }
    public static void Insertion(int[] arr,int n ){
        for(int i=0 ; i<=n-2;i++){
            for(int j=i+1; j>0 ;j--){
                if(arr[j-1]>arr[j]){
                    swap(arr,j);
                }
                else{
                    break;
                }
            }
        } 
    }
    public static void swap(int arr[],int j){
        int temp=arr[j];
        arr[j]=arr[j-1];
        arr[j-1]=temp;

    }
}