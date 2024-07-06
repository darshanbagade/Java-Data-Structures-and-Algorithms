import java.util.Arrays;

public class Es_03_SumTill_Index {

        public static void main(String[] args) {
        int[] arr ={ 1,2,3};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(runningSum(arr)));
    }
    static int[] runningSum(int[] nums){
        int sum=0;
        for(int i=0; i<nums.length ; i++){
            sum+=nums[i];
            nums[i]=sum;
        }
        return nums;
    }
}