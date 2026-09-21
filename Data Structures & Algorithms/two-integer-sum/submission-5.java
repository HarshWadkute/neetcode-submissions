class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> indexes=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int difference=target-nums[i];
            if(indexes.containsKey(difference)){
                return new int[]{indexes.get(difference),i};
            } else{
                indexes.put(nums[i],i);
            }
        }
        return new int[0];
    }
}
