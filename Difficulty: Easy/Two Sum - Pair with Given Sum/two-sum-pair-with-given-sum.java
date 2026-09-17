class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            int needed=target-arr[i];
            
            if(map.containsKey(needed)){
                return true;
            }
            else{
                map.put(arr[i],i);
            }
        }
        return false;
    }
}