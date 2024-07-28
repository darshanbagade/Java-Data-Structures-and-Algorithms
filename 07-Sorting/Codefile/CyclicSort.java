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
            int correct=arr[i] - 1 ;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }
    public static void swap(int[] arr , int a,int b) {
        arr[a]=arr[a]+arr[b];
        arr[b]=arr[a]-arr[b];
        arr[a]=arr[a]-arr[b];
    }
    
}
