
// import java.util.Arrays;

public class Strindbuildercode {
    public static void main(String[] args) {
 /*       
 
       1. StringBuilder builder = new StringBuilder();
          StringBuilder builder = new StringBuilder(50); //we can mention initial capacity , here initial capacity is 50

        //adding each char to stringbulider
        for(int i=0 ; i<26 ; i++){
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);
*/


        //
        //to initialise the stringbuilder of specified length we use .repeat(-lengthforstrbuilder-) having "k" at every index
        // StringBuilder strb = new StringBuilder("k".repeat(8));
        // strb.insert(2, "t");///it inserts string at particular index , index previous string at that position is incremented  
        // System.out.println(strb);



        // ----CAPACITY------
        //intial capacity of Stringbulider is 16 char if not mention
        //StringBuilder strb = new StringBuilder(50);
        // .capacity()  --> gives capacity of stringBuilder 
        // int cap = strb.capacity();
        // System.out.println(cap);



        //---3---
        StringBuilder strb = new StringBuilder("rrrrrr");
        strb.setCharAt(0, 'd');
        strb.setCharAt(1, 'k');
        strb.setCharAt(2, 'k');
        strb.setCharAt(3, 'k');
        strb.setCharAt(4, 'k');
        strb.setCharAt(5, 'k');

        System.out.println(strb);


        // strb.toString();  converts the stringbuilder to string
    }

}
