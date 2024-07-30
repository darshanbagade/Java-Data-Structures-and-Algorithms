// https://leetcode.com/problems/set-mismatch/
class E29_SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int[] arr=new int[2];
        int i=0;
        while(i<nums.length)
        {
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
                arr[0]=nums[i];
                arr[1]=i+1;
            }
        }
        return arr;   
        }

        public static void swap(int[] arr , int a,int b) {
            arr[a]=arr[a]+arr[b];
            arr[b]=arr[a]-arr[b];
            arr[a]=arr[a]-arr[b];
        }
        
}
