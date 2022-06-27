class Solution {
    public int kthFactor(int n, int k) {
        int size=n;
        int[] arr=new int[size];
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                arr[count]=i;
                count++;
            }
        }
        if(arr[k-1]!=0)
            return arr[k-1];
        else
            return -1;
    }
}