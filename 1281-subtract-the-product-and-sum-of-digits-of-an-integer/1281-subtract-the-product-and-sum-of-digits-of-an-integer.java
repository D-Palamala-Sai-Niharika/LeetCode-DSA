class Solution {
    public int subtractProductAndSum(int n) {
        int ld,sum=0,product=1;
        int temp=n;
        while(temp!=0){
            ld=temp%10;
            sum=sum+ld;
            product=product*ld;
            temp=temp/10;
        }
        return product-sum;
    }
}