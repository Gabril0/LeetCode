import java.util.HashMap;
class Solution {
    public int removeDuplicates(int[] nums) {
        /**
         * Author: https://github.com/Gabril0
         * Runtime: 2ms
         * Beats: 15.63%
         * Memory: 43.87
         * Beats: 59.78%
         * 
        To solve this, I will create a loop to iterate over the array and register every number that isn`t yet registered, then will create a array with the unique numbers
        */
        int uniqueIndex = 0;
        HashMap<Integer, Boolean> registred = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (!registred.containsKey(nums[i])) { //Checking if it is in the HashMap
                nums[uniqueIndex] = nums[i]; //Assigning the new unique number to the unique index position
                registred.put(nums[i], true); //Getting the new unique number
                uniqueIndex++; 
            }
        }
        
        return uniqueIndex;
    }
}