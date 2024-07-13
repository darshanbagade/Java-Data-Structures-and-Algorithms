public class AgnosticBinarySearch {
    public static void main(String[] args) {
        int[] nums = { 11,22,33,44,55,66,77,88,99,100};
        int target = 88;
        System.out.println(searchPosition(nums,target));
    }
    static int searchPosition(int[] nums , int target){
        int start=0;
        int end = nums.length - 1;
        int mid;
        boolean isIncreasing = nums[start] < nums[end];
        while(start<=end){
            mid = start + (end-start)/2 ;
            if(target == nums[mid]){
                return mid;
            }
            if(isIncreasing){
                if(nums[mid]>target){
                    end=mid-1;//search in left
                }
                else{
                    start = mid+1;
                }

            }
            else{
                if(nums[mid]<target){
                    end=mid-1;//search in left
                }
                else{
                    start = mid+1;
                }

            }
        }
        return -1;//Element not found
  
    }
}
