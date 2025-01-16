import java.util.Scanner;

public class I19_HCF{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two numbers :");
        int num1 =in.nextInt();
        int num2 =in.nextInt();
        int i=1;
        int hcf = (num1==0? num2:num1);

        if(num1<0){
            num1=num1*(-1);
        }
        if(num2<0){
            num2=num2*(-1);
        }
        
        while( i <= num1 && i <= num2 ){
            if(num1%i==0 && num2%i==0){
                hcf = i;
            }
            i++;
        }

        System.out.printf("HCF of (%d, %d) : %d  ", num1, num2, hcf);
    }
}
