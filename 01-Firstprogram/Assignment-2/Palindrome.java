import java.util.Scanner;

// 8.To find out whether the given String is Palindrome or not.

public class Palindrome {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the String :");
        String str = in.nextLine();
        int c=0 ;
        int n= str.length();
        while(c < n)
        {
            if(str.charAt(c)== str.charAt(n-1))
            {
                    c++;
                    n--;
            }
            else{
                System.out.println("Not Palindrome ");
                System.exit(0);
            }
        }

        System.out.println("Is Palindrome");
        

    }    
}
