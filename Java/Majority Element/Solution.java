import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        /**
         * Author: https://github.com/Gabril0
         * Runtime: 18 ms
         * Beats: 11.53%
         * Memory: 46.08 mb
         * Beats: 99.38%
        To solve this, i Will count the number of elements in the list and store the result in the hash, then i`ll compare the numbers to get the majority
        */
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        int majority = 0;
        int mostRepetitions = -1;
        for(int num:nums){
            if(!hash.containsKey(num)){
                hash.put(num,0);
            }
            else{
                hash.put(num,hash.get(num) + 1);
            }
            if(hash.get(num) > mostRepetitions){
                majority = num;
                mostRepetitions = hash.get(num);
            }
            
        }
        return majority;
    }
}