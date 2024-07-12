public class Q3_MinElementInTheRange
{
    public static void main(String args[])
    {
        int[] nums = { 9, 33, 12, 5, 2, 77, 23, 14};
        int ans=min_element(nums, 2,5);
        System.out.println(ans);
    }
    static int min_element(int[] nums , int start , int end){
        int min = nums[start];
        for(int i=start ; i<=end ; i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }
}