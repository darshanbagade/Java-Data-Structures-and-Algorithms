public class Es_10_SentenceIsPangram{
    //approach -1
    // public boolean checkIfPangram(String sentence) {
    //     boolean s=true;
    //     for(char ch='a';ch<='z';ch++){
    //         if(!sentence.contains(String.valueOf(ch))){
    //             s=false;
    //             break;
    //         }
    //     }
    //     return s;
    // }

    //approach -2
    public boolean checkIfPangram(String sentence){
        char ch = 'a';
        for(int i=0; i< 26 ; i++){
            int count=0;
            for(int j=0;j<sentence.length() ; j++){
                if(ch==sentence.charAt(j)){
                    count=1;
                    break;
                }
            }
            if(count==0){
                return false;
            }
            ch++;
        }
        return true;        
    }
}