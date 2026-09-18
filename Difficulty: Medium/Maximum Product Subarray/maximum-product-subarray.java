class Solution {
    int maxProduct(int[] arr) {
        // code here
        int n=arr.length;
        int maxpro=arr[0];
        int minpro=arr[0];
        int result=arr[0];
        
        for(int i=1;i<n;i++){
            
            int curr=arr[i];
            int temp=maxpro;
            
            maxpro=Math.max(curr,Math.max(curr*maxpro,curr*minpro));
            minpro=Math.min(curr,Math.min(curr*temp,curr*minpro));
            
            result=Math.max(maxpro,result);
        }
        return result;
    }
}