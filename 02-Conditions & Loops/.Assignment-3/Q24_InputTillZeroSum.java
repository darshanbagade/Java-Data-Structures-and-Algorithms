import java.util.Scanner;
public class Q24_InputTillZeroSum {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int num = in.nextInt();
        int sum =0;
        while(num!=0){
            sum+=num;
            num = in.nextInt();
        }
        System.out.println("The sum is " + sum);

    }
}
