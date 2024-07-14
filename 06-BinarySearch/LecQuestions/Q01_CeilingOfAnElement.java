//ceiling - smallest element greater than equal to target
public class Q01_CeilingOfAnElement {
    public static void main(String[] args) {
        int[] nums = { 2 ,3 ,5 ,14 ,16 ,18};
        int target=15;
        int ans = Ceiling(nums , target);
        System.out.println(ans);
    }
    
    //return index of smallest element >= target
    static int Ceiling(int nums[], int target){
        int start = 0; 
        int end = nums.length - 1;
        int mid;
        //if target element is greater than greatest element in the array
        if(target>nums[nums.length -1 ]){
            return -1;
        }

        while(start <= end ){
            mid = start + (end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    } 
}
