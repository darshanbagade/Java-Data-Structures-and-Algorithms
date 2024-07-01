// 23. Input a number and print all the factors of that number (use loops).

public class FactorOfTheNumber_23 {
    public static void main(String[] args) {
        int num = 35 ;

        for(int i= 1; i<=num ; i++){
            
            //checking foctor or not
            if(num%i==0){
                System.out.print(i + " ");
            }
        }


    }
    
}
