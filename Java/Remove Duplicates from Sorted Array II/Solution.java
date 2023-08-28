import java.util.HashMap;

class Solution {
    public int removeDuplicates(int[] nums) {
        /**
         * Author: https://github.com/Gabril0
         * Runtime: 2 ms
         * Beats: 12.46 % (you could use an static array instead of hash, but I like this solution because it makes sure that even in an unordered list it will work)
         * Memory: 43.52 mb
         * Beats: 79.94 %
        To solve this, I put the values into a hashmap, and it stores a key and also the number of times it appears
        */
        HashMap<Integer,Integer> hash = new HashMap<>(); //the first is the element, the second is the number of times it appears
        int newIndex = 0; //described as k in the problem
        
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i])) {
                hash.put(nums[i], hash.get(nums[i]) + 1);
                if (hash.get(nums[i]) <= 2) {
                    nums[newIndex] = nums[i];
                    newIndex++;
                }
            } else {
                hash.put(nums[i], 1);
                nums[newIndex] = nums[i];
                newIndex++;
            }
        }
        return newIndex;
    }
}