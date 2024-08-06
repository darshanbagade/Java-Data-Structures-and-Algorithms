import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');  //97+98=195  
        System.out.println("a" + "b");  //ab
        System.out.println('a' + 3);    //97+3=100
        System.out.println((char)('a' + 3)); //97+3=(char)100-->d
        System.out.println("a" + 1);    //a1
        //this is smae after few steps : "a" + "1"
        //when integer added with string ,integer will be converted to Integer that will call toString()
        //result is creating the new object
        System.out.println("Darshan" + new ArrayList<>());
        // System.out.println("Darshan" + new Integer(55));
        //any datatype added with string will converted to Integer will call toString
        
        // System.out.println(new Integer(56) + " " + new ArrayList<>());
        // + operator can add/ work on all the premitive datatypes &
        // with complex datatypes but atleast one string must present in b/w expression
        // all result will store in String datatype

    }
}
