// package 05-LinearSearch;
// 
public class Q5_NumberOfEvenDigits {
    public static void main(String[] args) {
        int[] nums = { 1,22,3,4,32,5,938,748,8390};
        int count_even_digit_num = CountEvenDigit(nums); 
        System.out.println(count_even_digit_num);
    }
    //to find no.of even digit numbers
    static int CountEvenDigit(int[] nums){
        int count=0;
        int digits ;
        for(int i=0; i< nums.length ; i++){
            digits = EvenDigitOrNot(nums[i]);
           if( (digits % 2 == 0) && digits!=0){
                count++;
           }
        }
        return count;
    }
    //to find number of digit
    static int EvenDigitOrNot(int num ){
        return (int)(Math.log10(num)) + 1;
    }
    
}
