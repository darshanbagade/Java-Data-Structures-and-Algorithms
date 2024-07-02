// 12. [Write a function to check if a given triplet is a Pythagorean triplet or not.]
// Pythagorean triplet - follows pythagoras theorem
import java.util.Scanner;
public class Q12_PythagoreanTripletOrNot {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in =new Scanner(System.in);
        System.out.print("Enter three numbers :");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        boolean ans = IsTriplet(a,b,c);
        System.out.println(ans);        
    }
    static boolean IsTriplet(int a,int b,int c)
    {
        return (a*a == b*b + c*c) || (b*b == a*a + c*c) || (c*c== a*a + b*b);
        
        // if( (a*a == b*b + c*c) || (b*b == a*a + c*c) || (c*c== a*a + b*b)) 
        // {
        //     return true;
        // }
        // return false;
    }

}
