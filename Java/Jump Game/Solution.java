class Solution {
    public boolean canJump(int[] nums) {
            /**
         * Author: https://github.com/Gabril0
         * Runtime: 2 ms
         * Beats: 80.27%
         * Memory: 40.11 mb
         * Beats: 70.89%
        To solve this, I need to calculate the max reach and check if it surpasses the array size, then try to find a path.
        */
        int maxReach = 0; 
        for (int i = 0; i < nums.length; i++) {
        
        if (i > maxReach) {
            return false;
        }
        
        maxReach = Math.max(maxReach, i + nums[i]);
        
        if (maxReach >= nums.length - 1) {
            return true;
        }
        }   
        return false;
    }
}