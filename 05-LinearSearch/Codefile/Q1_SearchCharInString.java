public class Q1_SearchCharInString{
    public static void main(String[] args) {
        String str ="Darshan";
        char target ='a' ;
        System.out.println(Search(str,target)); // true
    }
    static boolean Search(String str ,char target){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target){
                return true;
            }
        }
        return false;

    }
}