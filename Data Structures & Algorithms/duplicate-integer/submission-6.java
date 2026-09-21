class Solution {
    public boolean hasDuplicate(int[] nums) {
        /*key num value-count if num in set increase count for loop
        get or default 0 set.put
        */
        HashSet<Integer> hsr=new HashSet<>();
        for(int num:nums){
            if(hsr.contains(num)){
                return true;
            }
            hsr.add(num);
        }
        return false;
    }
}