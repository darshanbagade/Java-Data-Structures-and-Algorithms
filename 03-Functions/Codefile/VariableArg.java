import java.util.Arrays;

public class VariableArg {
    public static void main(String[] args) {
        //passing integers
        passArg(1,2,3,4);

        //passing variable String
        passString("Darshan" , "Bagade");

        //passing different arguments
        varArg( 1,2,    "Darshan","bagade");

    }

    static void passArg(int ...v)//consider integers as an array
    {
        System.out.println(Arrays.toString(v));        
    }    
    
    static void passString(String...v)//consider String
    {
        System.out.println(Arrays.toString(v));        
    }
    static void varArg(int a,int b ,String ...s)//Pass arguments in correct order
    {
        System.out.print(a + " " + b + " ");
        System.out.println(Arrays.toString(s));
    }
}
