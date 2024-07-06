import java.util.Arrays;
public class Es_02_ConcatenateArray {
    public static void main(String[] args) {
        int[] arr ={ 1,2,3};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
    static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        // System.arraycopy(source_arr,start_index,destination_arr,start_index,no_element_copied_of);
        System.arraycopy(nums,0,ans,0,nums.length);
        System.arraycopy(nums,0,ans,nums.length,nums.length);
        return ans;
    }
    
}
