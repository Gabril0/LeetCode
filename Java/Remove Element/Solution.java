class Solution {
    public int removeElement(int[] nums, int val) {
        /**
     * Author: https://github.com/Gabril0
     * Runtime: 0 ms
     * Beats: 100%
     * Memory: 41.23 mb
     * Beats: 22.35%
    To solve this, you want to overwrite the elements of the array using only elements different from val
    */
        int newListIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[newListIndex] = nums[i];
                newListIndex++;
            }
        }
        
        return newListIndex;//Using this variable because it counted the number of elements different from val
    }
}