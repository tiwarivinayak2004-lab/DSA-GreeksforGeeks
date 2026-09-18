class Solution {
    public void sort012(int[] arr) {
        // code here
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high){
            int temp=0;
            if(arr[mid]==0){
                temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                high--;
            }
        }
    }
}