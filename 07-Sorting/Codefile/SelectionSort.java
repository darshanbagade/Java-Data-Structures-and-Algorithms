/*/
Selection sort  --> select the max element and put into correct index
                --> Adaptive compare to bubble sort , as reduce no. of steps in swapping
                --> Worst case : O(N^2)
                --> Best case : O(N^2)
                --> Not stable sorting algorithm
                --> Can be apply on small arrays and lists 
*/

import java.util.Arrays;

public class SelectionSort{
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        selectionsort(arr);
        System.out.print(Arrays.toString(arr));
    }

    public static void selectionsort(int[] arr){
        int n=arr.length-1;
        int maxIn;
        for(int i=n; i>=0 ; i--){
            maxIn = maxIndex(arr, 0,i) ;
            
            Swap(arr,maxIn,i);
        }
    }
    
    //to find maxIndex
    public static int maxIndex(int[] arr, int start ,int last){
        int max=start;
        for(int i=1 ; i<=last ; i++){
            if(arr[max]<arr[i])
            {
                max=i;
            }
        }
        return max;

    }

    //To swap elements (put into correct index)
    public static void Swap(int[] arr,int first , int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
