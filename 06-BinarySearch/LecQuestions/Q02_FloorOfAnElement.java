// package 06-BinarySearch.LecQuestions;
//floor - largest element smaller than target
public class Q02_FloorOfAnElement {
    public static void main(String[] args) {
        int[] nums = { 2 ,3 ,5 ,14 ,16 ,18};
        int target=15;
        int ans = Floor(nums , target);
        System.out.println(ans);
    }
    //return index of largest element <= target
    static int Floor(int nums[], int target){
        int start = 0; 
        int end = nums.length - 1;
        int mid;
        //if target element is smaller than smaller element in the array
        if(target<nums[0]){
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
        return end;
    } 
}
