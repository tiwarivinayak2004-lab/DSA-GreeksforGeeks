class Solution {
    ArrayList<Integer> primeFactors(int n) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        
        while(n%2==0){
            res.add(2);
            n=n/2;
        }
        for(int i=3;i*i<=n;i+=2){
            while(n%i==0){
                res.add(i);
                n=n/i;
            }
        }
        if(n>1){
            res.add(n);
        }
        return res;
    }
}
