class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] ans=new int[accounts.length];
        int sum=0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
                sum=sum+accounts[i][j];
            }
            ans[i]=sum;
            sum=0;
        }
        int max=ans[0];
        for(int i=1;i<accounts.length;i++){
            if(ans[i]>max)
                max=ans[i];
        }
        return max;
    }
}