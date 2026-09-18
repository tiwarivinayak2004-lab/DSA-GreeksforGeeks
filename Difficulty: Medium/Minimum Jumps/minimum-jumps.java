class Solution {
    public int minJumps(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return 0;
        }
        if (arr[0] == 0) {
            return -1;
        }
        int jumps = 0;
        int currentEnd = 0;
        int maxReach = 0;
        for (int i = 0; i < n - 1; i++) {
            maxReach = Math.max(maxReach, i + arr[i]);
            if (i == currentEnd) {
                jumps++;
                currentEnd = maxReach;
                if (currentEnd >= n - 1) {
                    return jumps;
                }
            }
        }
        return -1;
    }
}