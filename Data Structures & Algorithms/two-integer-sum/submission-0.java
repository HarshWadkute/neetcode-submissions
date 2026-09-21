class Solution {
    public int[] twoSum(int[] nums, int target) {
        //target-nums[i]=difference
        //if hash.contains(difference)
        //return(j)
        //
        //if difference=nums[j] then return nums i and j
        //check for second pair
        Map<Integer, Integer> createMap= new HashMap<>();
        for (int i=0;i<nums.length;i++)
        {
            
            createMap.put(nums[i],i);
        }
        for (int i=0;i<nums.length;i++)
        {
           int diff=target-nums[i];
            if(createMap.containsKey(diff)&&createMap.get(diff)!= i)
            {
                return new int[]{i,createMap.get(diff)};
            }
        }
        return new int[0];
    }
}
