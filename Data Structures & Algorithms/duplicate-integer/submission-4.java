class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashSet<Integer> war=new HashSet<>();
       for (int i=0;i<nums.length;i++){
        if(war.contains(nums[i])){
            return true;
        }
        else{
            war.add(nums[i]);
        }
       }
       return false;
    }
}