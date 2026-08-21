class Solution {
    public int binaryToDecimal(String b) {
        // code here
        int i=1;
        int len=b.length();
        int j=0;
        int sum=0;
        
        while(j<len){
            char ch=b.charAt(len-i);
            if(ch=='1'){
                sum+=(int)Math.pow(2,j);
            }
            i++;
            j++;
        }
        return sum;
    }
}