import java.util.Arrays;
public class Es_04_RichestWealth {
        public static void main(String[] args) {
        int[][] arr = {
                        { 1,2,3},
                        { 1,2,3}
                        };
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
        System.out.println(maximumWealth(arr));
    }
    static int maximumWealth(int[][] accounts) {
        int[] sum= new int[accounts.length];
        for(int i=0 ; i< accounts.length ; i++){
            sum[i]= sum_row( accounts , i);
        }   
        return MaxInArray(sum);     
    }
    static int sum_row(int[][] acc , int a){
        int sum=0;
        for(int i=0 ; i< acc[a].length ; i++){
            sum+=acc[a][i];
        }
        return sum;
    }
    static int MaxInArray(int[] sum){
        int max= sum[0];
        for(int i=1 ; i<sum.length ; i++){
            if(max<sum[i]){
                max=sum[i];
            }
        }
        return max;
    }
}
