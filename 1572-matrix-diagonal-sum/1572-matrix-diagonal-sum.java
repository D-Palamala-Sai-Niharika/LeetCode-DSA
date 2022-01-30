class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0,i,j,row=mat.length,col=mat[0].length;
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                if(i==j || i+j==row-1){
                    sum=sum+mat[i][j];
                }
            }
        }
        return sum;
    }
}