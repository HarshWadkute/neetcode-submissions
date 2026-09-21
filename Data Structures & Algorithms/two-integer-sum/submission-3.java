class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hsr= new HashMap<>();
        for(int i=0;i<nums.length;i++){
        

        
        int  key=target-nums[i];
            if (hsr.containsKey(key)){
                return new int[]{hsr.get(key),i};
            }
        hsr.put(nums[i],i);
        }
        return new int[0];
    }
}
