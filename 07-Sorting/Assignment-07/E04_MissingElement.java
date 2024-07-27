//https://leetcode.com/problems/missing-number/
public class E04_MissingElement 
{
    public int missingNumber(int[] arr) {
         int i=0;
         while(i<arr.length){
            if(i==arr[i] || arr[i]==arr.length){
                    i++;
            }
            else{
                swap(arr,i,arr[i]);
            }
        }
        //Search element is at correct index 
        for( i=0 ; i<arr.length ; i++){
            if(i!=arr[i]){
                return i;
            }
        }
        return arr.length;
            
    }
    public static void swap(int[] arr , int a,int b) {
        arr[a]=arr[a]+arr[b];
        arr[b]=arr[a]-arr[b];
        arr[a]=arr[a]-arr[b];
    }
}

