import java.util.Scanner;

public class Q01_AreacOfCircle {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        float radius = in.nextFloat();

        float ans = (float) (3.14 * radius*radius);
        System.out.printf("Area of circle is : %f" , ans);
    }    
}
