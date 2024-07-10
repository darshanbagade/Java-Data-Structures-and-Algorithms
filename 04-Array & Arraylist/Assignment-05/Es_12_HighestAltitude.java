public class Es_12_HighestAltitude{

    public int largestAltitude(int[] gain) {
        int alt[] =new int[gain.length + 1]; //for altitudes
        alt[0]=0; // at point 0 -->altitube=0

        for(int i=0 ; i<gain.length ; i++){
            alt[i+1] = gain[i] + alt[i];
        } 
        return maxAltitude(alt);
    }
    public int maxAltitude(int[] alt){
        int max = alt[0];
        for(int i=1 ; i<alt.length ; i++){
            if(max<alt[i]){
                max=alt[i];
            }
        }
        return max;
    }
}