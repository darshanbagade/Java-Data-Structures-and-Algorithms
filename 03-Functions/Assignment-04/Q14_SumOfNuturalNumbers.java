// 14. [Write a function that returns the sum of first n natural numbers.]
import java.util.Scanner;
public class Q14_SumOfNuturalNumbers {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner (System.in);
        System.out.println("Enter nth number : ");
        int num= in .nextInt();
        int ans = Natural_Sum(num);
        System.out.println("Sum of Natural number " + ans);
    }
    static int Natural_Sum(int num)
    {
        int sum=0;
        while(num>=0){
            sum+=num;
            num--;
        }
        return sum;
    }
    
}
