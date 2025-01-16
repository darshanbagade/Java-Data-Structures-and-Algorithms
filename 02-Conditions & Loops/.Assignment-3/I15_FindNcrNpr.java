// 15.Find Ncr and Npr
import java.util.Scanner;
public class I15_FindNcrNpr {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n & r (n > r):");  //n > r
        int n = input.nextInt();
        int r = input.nextInt();
        
        long nCr = (Fact(n)) / (Fact(r)*Fact(n-r));
        long nPr = (Fact(n) / Fact(n-r));

        System.out.println("nCr = " + nCr);
        System.out.println("nPr = " + nPr);
        
    }
    static long Fact(int num){
        long fact=1;
        if(num==0 || num ==1){        
            return 1;
        }
        for(int i=1 ; i<=num ; i++){
            fact = fact * i; 
        }
        return fact;
    }
}
