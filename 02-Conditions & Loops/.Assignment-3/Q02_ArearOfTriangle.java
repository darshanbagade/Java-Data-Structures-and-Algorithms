import java.util.Scanner;

public class Q02_ArearOfTriangle {
        public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the height : ");
        float height = in.nextFloat();
        System.out.println("Enter the base : ");
        float base = in.nextFloat();

        float ans = (float)(0.5 * base*height);
        System.out.printf("Area of triangle is : %.2f" , ans);
    }    
}
