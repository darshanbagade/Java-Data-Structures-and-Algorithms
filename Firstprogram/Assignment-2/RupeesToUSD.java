import java.util.Scanner;

public class RupeesToUSD {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the amount in rupees :");
            float rupees = in.nextFloat();

            System.out.println("In USD : " + (float)( rupees* 0.012) + "USD");

        }
    }
    
}
