class Es_08_SmallerthanCurrentElement {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length ; i++){
            ans[i]=count_smaller(nums,nums[i]);            
        }
        return ans;
    }
    public int count_smaller(int[] arr, int num){
        int count=0;
        for(int i=0;i<arr.length ; i++){
            if(arr[i]<num){
                count++;
            }
        }
        return count;
    }
}
