class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int flag=1;
        for(int i=0;i<arr.length-2;i++){
            if(arr[i]-arr[i+1]!=arr[i+1]-arr[i+2]){
                flag=0;
                break;
            }
        }
        if(flag==0)
            return false;
        else
            return true;
    }
}