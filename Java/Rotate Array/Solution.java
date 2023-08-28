class Solution {
    public void rotate(int[] nums, int k) {
         /**
         * Author: https://github.com/Gabril0
         * Runtime: 1 ms
         * Beats: 50.33%
         * Memory: 55.5 mb
         * Beats: 69.44%
        To solve this, i need to calculate the position regarding the limit of the array and send the numbers to the start when an overflow happens.
        */
        int[] result = new int[nums.length]; 
        
        for (int i = 0; i < nums.length; i++) {
            int newPosition = (i + k) % nums.length; // module operation gives me the remaining, which is the desired position.
            
            result[newPosition] = nums[i]; 
        }
        
        System.arraycopy(result, 0, nums, 0, nums.length);
    }
}