public class Strindbuildercode {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        //adding each char to stringbulider
        for(int i=0 ; i<26 ; i++){
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        
        System.out.println(builder);
    }
}
