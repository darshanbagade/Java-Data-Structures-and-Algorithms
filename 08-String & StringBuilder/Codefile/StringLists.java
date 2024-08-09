
import java.util.ArrayList;
import java.util.List;

public class StringLists {

    /*
         List   ---> Lists are used to store an ordered collection of elements that can change the size of a list at runtime. 
                ---> You can add or remove elements from a list dynamically, which automatically adjusts its size. 
     */

    public static void main(String[] args) {
        // create a new ArrayList
        List<String> myList = new ArrayList<>();

        // add elements to the list using the add() method
        myList.add("apple");
        myList.add("banana");
        myList.add("cherry");

        // print the contents of the list
        System.out.println(myList);
        System.out.println(myList.get(0));




        // 2D List-->prefer problem 04 of assignment
    }
    
}
