
import java.util.Arrays;

public class StringBuilderMethods {
    public static void main(String[] args) {
        String name = "Darshan bagade";

        //converted string to char array
        System.out.println(Arrays.toString(name.toCharArray())); 
        //[D, a, r, s, h, a, n,  , b, a, g, a, d, e]

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf('a'));
        System.out.println(name.contains("shan"));
        System.out.println((char)name.codePointAt(0));
        System.out.println("   darshan   ".strip());//removes blank space
        System.out.println(Arrays.toString(name.split(" ")));//split where space

    }
    
}
