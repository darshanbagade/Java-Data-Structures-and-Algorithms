public class Es_13_FlippingImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] ans = new int[image.length][image[0].length];
        int x;
        for(int i=0 ; i<image.length ; i++){
            x=0;
            for(int j=(image.length-1)  ; j>=0 ; j--)
            {
                ans[i][x]=image[i][j];
                if(ans[i][x]==1){
                    ans[i][x]=0;
                }
                else{
                    ans[i][x]=1;
                }
                x++;
            }
        }
        return ans;
        
    }
}