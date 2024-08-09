public class E01_DefangingAnAddress{
    public static void main(String[] args) {
        String str= "255.100.50.0";
        System.out.println(defangIPaddr(str));

    }
    public static String defangIPaddr(String address) {
        return address.replace(".","[.]");
        
    }
}

// o/p :  1[.]1[.]1[.]1