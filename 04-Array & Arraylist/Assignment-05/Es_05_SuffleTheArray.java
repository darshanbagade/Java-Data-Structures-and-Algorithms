//Read problem statement from the link - https://leetcode.com/problems/shuffle-the-array/
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int counter =0;
        for(int i=0 ; i < n*2 ; i= i+2 ){
            ans[i]=nums[counter];
            ans[i+1]=nums[n+counter];
            counter++;
        }
        return ans;
       
    }
}
