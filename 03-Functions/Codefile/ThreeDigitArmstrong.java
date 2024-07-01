public class ThreeDigitArmstrong {
    public static void main(String[] args) {
        armstrong();
    }
    static void armstrong()
    {
    
        for(int i=100 ; i<1000 ; i++){
            int org=i;
            int sum=0;
            while(org!=0)
            {
                int r= org%10;
                sum+=r*r*r;
                org/=10;

            }
            if(sum==i){
                System.out.println(i + " ");
            }

        } 
    }
}
