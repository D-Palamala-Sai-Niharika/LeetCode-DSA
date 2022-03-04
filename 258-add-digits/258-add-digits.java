class Solution {
    public int helper(int num){
        int s=0,temp=num,r;
        while(temp>0){
            r=temp%10;
            s=s+r;
            temp=temp/10;
        }
        return s;
    }
    public int addDigits(int num) {
        int sum = helper(num);
        if(sum%10==sum){
            return sum;
        }
        return addDigits(sum);
    }
}