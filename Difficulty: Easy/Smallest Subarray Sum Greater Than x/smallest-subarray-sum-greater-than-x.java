class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
        // code here
        int l=0,r=0,sum=0,minlen=Integer.MAX_VALUE;
        int n=arr.length;
        while(r<n){
            sum+=arr[r];
            while(sum>x){
                minlen=Math.min(minlen,r-l+1);
                sum-=arr[l];
                l++;
            }
            r=r+1;
        }
        if(minlen==Integer.MAX_VALUE) return 0;
        else return minlen;
    }
}
