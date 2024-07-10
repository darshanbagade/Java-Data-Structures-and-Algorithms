public class Es_15_MatrixDiagonalSum {
    public int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length];
        //outer loop will run till number of elements in row of original matrix
        for(int i=0 ;i<matrix[0].length ; i++){
            //inner loop will run till number of elements in col of original matrix
            for(int j=0 ; j<matrix.length ; j++){
                ans[i][j]=matrix[j][i];
            }
        }
        System.gc();
        return ans;    

    }
}