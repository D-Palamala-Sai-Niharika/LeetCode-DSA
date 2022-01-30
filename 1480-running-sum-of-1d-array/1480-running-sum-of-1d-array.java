class Solution {
    public int[] runningSum(int[] nums) {
        int l=nums.length;
        int[] ans=new int[l];
        int sum=0;
        for(int i=0;i<l;i++){
            for(int j=0;j<=i;j++){
                sum=sum+nums[j];
            }
            ans[i]=sum;
            sum=0;
        }
        return ans;
    }
}