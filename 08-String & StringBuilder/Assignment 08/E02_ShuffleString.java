public class E02_ShuffleString {
    
    public String restoreString(String s, int[] indices) {
        int length=s.length();
        char[] c = new char[length];
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<length ;i++){
            c[indices[i]]=s.charAt(i);
        }
        //The append(c) method of StringBuilder takes the entire character array 'c' and appends its contents to the StringBuilder object 'sb'.
        sb.append(c);
        return sb.toString();
    }
    
}
