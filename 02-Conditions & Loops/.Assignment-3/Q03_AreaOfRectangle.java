import java.util.Scanner;
public class Q03_AreaOfRectangle {
    public static void  main(String[] args){
        @SuppressWarnings("resource")
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter length & breadth :");
        float l = in.nextFloat();
        float b = in.nextFloat();
        float ans = l*b;
        System.out.println("Area of triangle : " + ans);
    }
}
