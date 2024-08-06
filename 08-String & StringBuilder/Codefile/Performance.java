public class Performance{
    public static void main(String[] args) {
        String series="";

        //everytime creating new object 
        // O(N^2)
        for(int i=0; i<26;i++){
            char ch= (char) ('a' + i) ;
            series= series + ch ;
        }
        System.out.println(series);
    }
}