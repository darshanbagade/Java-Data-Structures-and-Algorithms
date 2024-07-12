public class Q4_MinIn2DArray {
    public static void main(String[] args) {
        int[][] arr = { 
                        { 1 ,-3 , 66 },
                        { 43,-5 , -1 },
                        { 3 , 0 , 32 }
                        };
        System.out.println(minInArr(arr));
    }
    static int minInArr(int[][] arr){
        int min = arr[0][0];
        for (int[] arr1 : arr) {
            for (int col = 0; col < arr1.length; col++) {
                if (arr1[col] < min) {
                    min = arr1[col];
                }
            }
        }
        return min;
    }
}
