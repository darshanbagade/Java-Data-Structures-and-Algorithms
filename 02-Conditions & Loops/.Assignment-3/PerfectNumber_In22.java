// 22. Perfect Number - is equal to the total of its positive divisors except itself
public class PerfectNumber_In22 {
    public static void main(String[] args) {
        int num= 496;
        int sum= 0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num)        {
            System.out.println("Perfect number");
        }
        else{
            System.out.println("Not perfect ");
        }

    }
}
