class Solution {
    public int longestSubstr(String s, int k) {
        // code here
        int l=0,r=0,maxf=0;
        int maxlen=0;
        int hash[]=new int[26];
        while(r<s.length()){
            char right=s.charAt(r);
            hash[right-'A']++;
            maxf=Math.max(maxf,hash[right-'A']);
            int windowlength=r-l+1;
            if(windowlength-maxf>k){
                char left=s.charAt(l);
                hash[left-'A']--;
                maxf=0;
                l=l+1;
            }
            if(windowlength-maxf<=k){
                maxlen=Math.max(maxlen,windowlength);
            }
            r++;
        }
        return maxlen;
    }
}
