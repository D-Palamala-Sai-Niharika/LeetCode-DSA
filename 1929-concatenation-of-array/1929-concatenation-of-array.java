class Solution {
    public int[] getConcatenation(int[] nums) {
        int l=nums.length;
        int[] ans=new int[2*l];
        int j=0;
        for(int i=0;i<2*l;i++){
            if(i<l){
                ans[i]=nums[j];
                j++;
            }
            else if(i==l){
                j=0;
                ans[i]=nums[j];
                j++;
            }
            else{
                ans[i]=nums[j];
                j++;
            }
        }
        return ans;
    }
}