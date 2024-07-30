import java.util.ArrayList;
import java.util.List;

public class M12_FindAllDuplicatesInAnArray 
{
        public List<Integer> findDuplicates(int[] nums) {
            ArrayList<Integer> list = new ArrayList<>();
            int i=0;
            while(i<nums.length){
                int correct=nums[i]-1;
                if(nums[i]!=nums[correct] ){
                    swap(nums,i,correct);
                }
                else{
                    i++;
                }
            }
    
            for(i=0;i<nums.length ; i++){
                if(i!=nums[i]-1){
                list.add(nums[i]);
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