class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        HashMap<Character,Integer> map=new HashMap<>();
        int l=0,r=0,maxlen=0;
        int n=s.length();
        while(r<n){
            char ch=s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);

            if(map.size()>k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);

                if(map.get(s.charAt(l))==0){
                        map.remove(s.charAt(l));
                }
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        if(map.size()<k){
            return -1;
        }
        else return maxlen;
        
    }
}