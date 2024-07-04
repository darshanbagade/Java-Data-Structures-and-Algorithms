import java.util.Arrays;
public class Q1_SwapInArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));

        swap(arr,0,4);//swap index 0 with 4
        System.out.println(Arrays.toString(arr));
    }

    //swap method
    static void swap(int[] arr , int a,int b){
        arr[a] = arr[a] + arr[b];
        arr[b] = arr[a] - arr[b];
        arr[a] = arr[a] - arr[b];
    }
}
