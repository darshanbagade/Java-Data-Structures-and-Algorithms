/* 8. Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:

Marks        Grade 
91-100         AA 
81-90          AB 
71-80          BB 
61-70          BC 
51-60          CC 
41-50          DD 
<=40          Fail 
*/
import java.util.Scanner;
public class Q08_DisplayGrades {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the marks out of 100 : ");
        float marks = sc.nextFloat();
        System.out.println("Grade " + Grade(marks));
    }
    static String Grade(float marks){
        if(marks>=91){
            return "AA";
        }
        else if(marks>=81){
            return "AB";
        }
        else if(marks>=71){
            return "BB";
        }
        else if(marks>=61){
            return "BC";
        }
        else if(marks>=51){
            return "CC";
        }
        else if(marks>40){
            return "DD";
        }
        else if(marks<=40){
            return "fail";
        }
        else{
            return "Invalid marks!";
        }

    }
    
}
