class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> numFreq = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            if(numFreq.containsKey(nums[i])){
                return true;
            }
            numFreq.put(nums[i], 1);
        }
        return false;
    }
}