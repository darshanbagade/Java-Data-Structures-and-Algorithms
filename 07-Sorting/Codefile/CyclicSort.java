import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={3,2,4,1,5};
        System.out.println(Arrays.toString(arr));
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));


    }
    public static void cyclicsort(int[] arr){
        int i=0;
        while(i<arr.length){
            if(i==arr[i]-1){
                i++;
            }
            else{
                swap(arr,i,arr[i]-1);
            }
        }
    }
    public static void swap(int[] arr , int a,int b) {
        arr[a]=arr[a]+arr[b];
        arr[b]=arr[a]-arr[b];
        arr[a]=arr[a]-arr[b];
    }
    
}
