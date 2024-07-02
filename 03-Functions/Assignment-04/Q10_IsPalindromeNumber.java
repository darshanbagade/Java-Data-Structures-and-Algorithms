// 10. [Write a function to find if a number is a palindrome or not. Take number as parameter.]
import java.util.Scanner;
public class Q10_IsPalindromeNumber {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        System.out.println(IsPalindrome(num));
    }
    static boolean IsPalindrome(int num)
    {
        int org=num;
        int reverse=0;
        while(org !=0){
            reverse = (reverse * 10) + (org % 10);
            org/=10;
        }
        return num==reverse;
    }
    
}
