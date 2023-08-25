import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        /**
         * Author: https://github.com/Gabril0
         * Runtime: 1 ms 
         * Beats: 99.42%
         * Memory: 43.1 MB
         * Beats: 99.16%
        To solve this, I need to get the first number from the array minus the target, and then search for the result
        in the array. If there aren`t any numbers that satisfy the condition, repeat using the next one.
        */
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>(); //Hashmap to find the results faster
        for(int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i]; //Finding the remaining 
            if(hash.containsKey(remaining)){
                return new int[]{hash.get(remaining), i};
            }
            hash.put(nums[i], i); //Making the register of the number
        }
        return null;
    }
}