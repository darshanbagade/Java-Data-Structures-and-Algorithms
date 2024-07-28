//  https://leetcode.com/problems/find-the-duplicate-number/
public class M11_FindDuplicateElements {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        int ans=0;
        for(i=0;i<nums.length;i++){
            if((i)!=nums[i]-1)
            {
                ans=nums[i];
                break;
            }
        }
        return ans;
    }
    public static void swap(int[] arr , int a,int b) {
        arr[a]=arr[a]+arr[b];
        arr[b]=arr[a]-arr[b];
        arr[a]=arr[a]-arr[b];
    }
}