import java.util.Scanner;
public class IsPalindrome {
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            String str= in.nextLine();
            int s=0;
            int e=str.length()-1;
            while(s<e){
                if(str.charAt(s)!=str.charAt(e)){
                    System.out.println("Not Palindrome");
                    return;
                }
                s++;
                e--;
            }
        }
        System.out.println("Is Palindrome");
    }
    
}
