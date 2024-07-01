
import java.util.Arrays;

public class Functions {
    
    /*
     * Functions -bolck of code perform specific task
     *  
     * In premitives     ---> value of is passed, but change in function will not reflect in main function (ex- int,short,char)  
                         ---> value in the main fuction will not change  

     * In non-premitives ---> value of reference varial is passed, but change in function will  reflect in main function (ex- array)
                         ---> value in the main fuction will also change  

     * no concept of pass by refernce in java                   
     */

     public static void main(String[] args) {
         int a=10;
         int b=3;
         System.out.println("a= " + a + " b= " + b);
         swap(a,b);// change will not reflect for premitives
         System.out.println("a= " + a + " b= " + b);
         
         int arr[] ={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        change(arr); // Change will reflect in main for non-premitives
        System.out.println(Arrays.toString(arr));

        
        
     }
     
     static void swap(int num1 ,int num2)
     {
         //approach 1 - swapping
        // int temp = num1;
        // num1 = num2;
        // num2 = temp;

        //approach 2 - swapping
        // num1 =num1 + num2 ;
        // num2 =num1 - num2 ;
        // num1 =num1 - num2 ;
     }

     static void change(int[] arr1){ //value of ref. variable is passed
        arr1[0]=99;
     }





}
