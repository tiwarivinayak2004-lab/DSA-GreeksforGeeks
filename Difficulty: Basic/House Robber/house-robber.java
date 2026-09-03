class Solution {
    public int maximizeMoney(int n, int k) {
        // code here
        int res=0;
        if(n%2==0){
            res=(n/2)*k;
            return res;
        }
        res=((n/2)+1)*k;
        return res;
        
    }
}