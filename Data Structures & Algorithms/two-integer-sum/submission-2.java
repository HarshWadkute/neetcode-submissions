class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hsr=new HashMap<>();
        for(int num=0;num<nums.length;num++){
            hsr.put(nums[num],num);
         
        }
        for(int num=0;num<nums.length;num++){
        int key=target-nums[num];
        if(hsr.containsKey(key) && hsr.get(key)!=num){
           return new int[] {num,hsr.get(key)};        }
        }
       return new int[0]; 
    }
}
