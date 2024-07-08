
import java.util.ArrayList;
import java.util.Scanner;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);

        // list.add(73);// to insert element into the Arraylist
        // list.add(25);
        // list.add(3);
        // list.add(89);
        // list.add(5);
        // list.add(44);
        // System.out.println(list);

        // list.remove(2); //remove element at index 2
        // System.out.println(list);
        
        // list.set(0, 99);//replace element at index 0
        // System.out.println(list);

        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);

        //input
        for(int i=0 ;i<5 ;i++){
            list.add(in.nextInt());
        }

        list.add(0,99);
        //output
        for(int i=0; i<7 ; i++){
            System.out.print(list.get(i) + " ");//get element at index 3
        }
    }
}
