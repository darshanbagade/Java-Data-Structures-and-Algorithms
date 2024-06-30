
import java.util.Scanner;

// package 2-Conditions & Loops.Codefile;

/*
   Alphabet case check :
        “ Take an input character from keyboard and check weather it
        is Upper case alphabet or lower case alphabet” 

 */

public class AlphabetCase {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the character : ");

        char ch = input.next().trim().charAt(0);

        if(ch >= 'a' && ch<= 'z')
        {
            System.out.print("Lowercase");
        }
        else if(ch >= 'A' && ch<= 'Z'){
            System.out.print("Uppercase");
        }
        else{
            System.out.println("Wrong Input");
        }
        
    }
}
