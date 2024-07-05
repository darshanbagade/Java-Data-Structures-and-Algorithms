import java.util.Arrays;

public class Es_01_BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] arr ={ 0,2,1,5,3,4};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(BuildArray(arr)));
    }
    static int[] BuildArray(int[] nums){
        int ans[] = new int[nums.length];
        for(int i=0; i<nums.length ; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
