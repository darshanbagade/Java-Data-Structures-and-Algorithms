// 25. Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
public class AllowedEvenDaysInAugust_In25 {
    public static void main(String[] args) {
        int num = 31;//num of days in august 
        int count=0;
        for(int i=2 ; i<=num ; i++)
        {
            if(i%2==0)
            {
                count++;
            }
        }
        System.out.println("Number of even days when kunal can go out : " + count);
    }
}
