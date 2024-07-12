//Return index of min element in the range in an arr if not found return -1 
public class Q2_MinInRange {
    public static void main(String[] args) {
        int[] arr = {22,35,-4,2,56,-7,1};
        int target=22;
        System.out.println(min(arr, target, 1, 5 ));
    }
    static int min(int[] arr ,int target, int start, int end ){
        for(int i=start ; i<end ; i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    } 
}
