class Solution {
    public int findGCD(int[] nums) {
        int gcd=1;
        Arrays.sort(nums);
        int min=nums[0],max=nums[nums.length-1];
        for(int i=1;i<=max;i++){
            if(min%i==0&&max%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
}