class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    /**
     * Author: https://github.com/Gabril0
     * Runtime: 0 ms
     * Beats: 100%
     * Memory: 41.08 mb
     * Beats: 88.70%
    To solve this, I need to compare the number from the first array with the second, the higher one goes to a second list and then do this until there aren`t more numbers,
    after that I just need to copy the array to the nums1.
    */
    int[] tempArray = new int[m + n]; //Making an temporary array to store the numbers
    int position1 = 0, position2 = 0, tempPositions = 0; //Position to track each array

    while (position1 < m || position2 < n) {
        if (position1 < m && (position2 >= n || nums1[position1] <= nums2[position2])) {
            tempArray[tempPositions] = nums1[position1];
            position1++;
        } else {
            tempArray[tempPositions] = nums2[position2];
            position2++;
        }
        tempPositions++;
    }

    System.arraycopy(tempArray, 0, nums1, 0, m + n); //Transfering the data
    }
}
