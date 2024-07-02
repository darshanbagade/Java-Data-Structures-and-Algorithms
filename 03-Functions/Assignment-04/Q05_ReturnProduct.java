// 5. [Define a method that returns the product of two numbers entered by user.]
import java.util.Scanner;
public class Q05_ReturnProduct {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int ans = Product(a,b); 
        System.out.println("Product = " + ans );
    }
    static int Product(int a,int b){
        return (a*b);
    }
}
