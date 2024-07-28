import java.util.ArrayList;
import java.util.List;
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class E28_FindAllDissapperedElementsInAnArray {
      public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        ArrayList<Integer> list = new ArrayList<>();
        while(i<nums.length){
            int correct=nums[i] - 1 ;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        for( i=0;i<nums.length;i++){
            if(i!=nums[i]-1){
                list.add(i+1);
            }
        }
        return list;
    }
    public static void swap(int[] arr , int a,int b) {
        arr[a]=arr[a]+arr[b];
        arr[b]=arr[a]-arr[b];
        arr[a]=arr[a]-arr[b];
    }
}
